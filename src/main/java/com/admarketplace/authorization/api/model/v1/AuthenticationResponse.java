package com.admarketplace.authorization.api.model.v1;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the response from an authentication request.
 * This record holds the details of the authentication response including the
 * access token, token type, and expiration time.
 *
 * @param accessToken The access token granted upon successful authentication.
 * @param tokenType   The type of the token (e.g., "Bearer").
 * @param expiresIn   The expiration time of the token, represented in seconds.
 * @param message     The message associated with the authentication response.
 */
public record AuthenticationResponse(
    @JsonProperty("access_token")
    String accessToken,
    @JsonProperty("token_type")
    String tokenType,
    @JsonProperty("expires_in")
    Integer expiresIn,
    String message
) {
}
