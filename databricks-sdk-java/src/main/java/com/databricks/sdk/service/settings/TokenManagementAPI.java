// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Enables administrators to get all tokens and delete tokens for other users. Admins can either get
 * every token, get a specific token by ID, or get all tokens for a particular user.
 */
@Generated
public class TokenManagementAPI {
  private static final Logger LOG = LoggerFactory.getLogger(TokenManagementAPI.class);

  private final TokenManagementService impl;

  /** Regular-use constructor */
  public TokenManagementAPI(ApiClient apiClient) {
    impl = new TokenManagementImpl(apiClient);
  }

  /** Constructor for mocks */
  public TokenManagementAPI(TokenManagementService mock) {
    impl = mock;
  }

  public CreateOboTokenResponse createOboToken(String applicationId, long lifetimeSeconds) {
    return createOboToken(
        new CreateOboTokenRequest()
            .setApplicationId(applicationId)
            .setLifetimeSeconds(lifetimeSeconds));
  }

  /**
   * Create on-behalf token.
   *
   * <p>Creates a token on behalf of a service principal.
   */
  public CreateOboTokenResponse createOboToken(CreateOboTokenRequest request) {
    return impl.createOboToken(request);
  }

  public void delete(String tokenId) {
    delete(new DeleteTokenManagementRequest().setTokenId(tokenId));
  }

  /**
   * Delete a token.
   *
   * <p>Deletes a token, specified by its ID.
   */
  public void delete(DeleteTokenManagementRequest request) {
    impl.delete(request);
  }

  public TokenInfo get(String tokenId) {
    return get(new GetTokenManagementRequest().setTokenId(tokenId));
  }

  /**
   * Get token info.
   *
   * <p>Gets information about a token, specified by its ID.
   */
  public TokenInfo get(GetTokenManagementRequest request) {
    return impl.get(request);
  }

  /**
   * List all tokens.
   *
   * <p>Lists all tokens associated with the specified workspace or user.
   */
  public Iterable<PublicTokenInfo> list(ListTokenManagementRequest request) {
    return impl.list(request).getTokenInfos();
  }

  public TokenManagementService impl() {
    return impl;
  }
}