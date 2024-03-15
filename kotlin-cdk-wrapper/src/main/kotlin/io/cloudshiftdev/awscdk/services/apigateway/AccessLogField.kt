@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Deprecated
import kotlin.String

/**
 * $context variables that can be used to customize access log pattern.
 *
 * Example:
 *
 * ```
 * AccessLogFormat.custom(JSON.stringify(Map.of(
 * "requestId", AccessLogField.contextRequestId(),
 * "sourceIp", AccessLogField.contextIdentitySourceIp(),
 * "method", AccessLogField.contextHttpMethod(),
 * "userContext", Map.of(
 * "sub", AccessLogField.contextAuthorizerClaims("sub"),
 * "email", AccessLogField.contextAuthorizerClaims("email")))));
 * ```
 */
public open class AccessLogField internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.AccessLogField,
) : CdkObject(cdkObject) {
  public companion object {
    @Deprecated(message = "deprecated in CDK")
    public fun contextAccountId(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextAccountId()

    public fun contextApiId(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextApiId()

    public fun contextAuthenticateError(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextAuthenticateError()

    public fun contextAuthenticateLatency(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextAuthenticateLatency()

    public fun contextAuthenticateStatus(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextAuthenticateStatus()

    public fun contextAuthorizeError(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextAuthorizeError()

    public fun contextAuthorizeLatency(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextAuthorizeLatency()

    public fun contextAuthorizeStatus(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextAuthorizeStatus()

    public fun contextAuthorizer(`property`: String): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextAuthorizer(`property`)

    public fun contextAuthorizerClaims(`property`: String): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextAuthorizerClaims(`property`)

    public fun contextAuthorizerError(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextAuthorizerError()

    public fun contextAuthorizerIntegrationLatency(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextAuthorizerIntegrationLatency()

    public fun contextAuthorizerIntegrationStatus(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextAuthorizerIntegrationStatus()

    public fun contextAuthorizerLatency(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextAuthorizerLatency()

    public fun contextAuthorizerPrincipalId(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextAuthorizerPrincipalId()

    public fun contextAuthorizerRequestId(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextAuthorizerRequestId()

    public fun contextAuthorizerStatus(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextAuthorizerStatus()

    public fun contextAwsEndpointRequestId(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextAwsEndpointRequestId()

    public fun contextCallerAccountId(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextCallerAccountId()

    public fun contextCustomDomainBasePathMatched(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextCustomDomainBasePathMatched()

    public fun contextDomainName(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextDomainName()

    public fun contextDomainPrefix(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextDomainPrefix()

    public fun contextErrorMessage(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextErrorMessage()

    public fun contextErrorMessageString(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextErrorMessageString()

    public fun contextErrorResponseType(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextErrorResponseType()

    public fun contextErrorValidationErrorString(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextErrorValidationErrorString()

    public fun contextExtendedRequestId(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextExtendedRequestId()

    public fun contextHttpMethod(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextHttpMethod()

    public fun contextIdentityAccountId(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextIdentityAccountId()

    public fun contextIdentityApiKey(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextIdentityApiKey()

    public fun contextIdentityApiKeyId(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextIdentityApiKeyId()

    public fun contextIdentityCaller(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextIdentityCaller()

    public fun contextIdentityClientCertIssunerDn(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextIdentityClientCertIssunerDN()

    public fun contextIdentityClientCertPem(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextIdentityClientCertPem()

    public fun contextIdentityClientCertSerialNumber(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextIdentityClientCertSerialNumber()

    public fun contextIdentityClientCertSubjectDn(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextIdentityClientCertSubjectDN()

    public fun contextIdentityClientCertValidityNotAfter(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextIdentityClientCertValidityNotAfter()

    public fun contextIdentityClientCertValidityNotBefore(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextIdentityClientCertValidityNotBefore()

    public fun contextIdentityCognitoAuthenticationProvider(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextIdentityCognitoAuthenticationProvider()

    public fun contextIdentityCognitoAuthenticationType(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextIdentityCognitoAuthenticationType()

    public fun contextIdentityCognitoIdentityId(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextIdentityCognitoIdentityId()

    public fun contextIdentityCognitoIdentityPoolId(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextIdentityCognitoIdentityPoolId()

    public fun contextIdentityPrincipalOrgId(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextIdentityPrincipalOrgId()

    public fun contextIdentitySourceIp(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextIdentitySourceIp()

    public fun contextIdentityUser(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextIdentityUser()

    public fun contextIdentityUserAgent(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextIdentityUserAgent()

    public fun contextIdentityUserArn(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextIdentityUserArn()

    public fun contextIntegrationErrorMessage(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextIntegrationErrorMessage()

    public fun contextIntegrationLatency(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextIntegrationLatency()

    public fun contextIntegrationStatus(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextIntegrationStatus()

    public fun contextOwnerAccountId(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextOwnerAccountId()

    public fun contextPath(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextPath()

    public fun contextProtocol(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextProtocol()

    public fun contextRequestId(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextRequestId()

    public fun contextRequestOverrideHeader(headerName: String): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextRequestOverrideHeader(headerName)

    public fun contextRequestOverridePath(pathName: String): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextRequestOverridePath(pathName)

    public fun contextRequestOverrideQuerystring(querystringName: String): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextRequestOverrideQuerystring(querystringName)

    public fun contextRequestTime(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextRequestTime()

    public fun contextRequestTimeEpoch(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextRequestTimeEpoch()

    public fun contextResourceId(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextResourceId()

    public fun contextResourcePath(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextResourcePath()

    public fun contextResponseLatency(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextResponseLatency()

    public fun contextResponseLength(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextResponseLength()

    public fun contextResponseOverrideHeader(headerName: String): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextResponseOverrideHeader(headerName)

    public fun contextResponseOverrideStatus(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextResponseOverrideStatus()

    public fun contextStage(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextStage()

    public fun contextStatus(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextStatus()

    public fun contextWafError(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextWafError()

    public fun contextWafLatency(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextWafLatency()

    public fun contextWafResponseCode(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextWafResponseCode()

    public fun contextWafStatus(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextWafStatus()

    public fun contextWebaclArn(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextWebaclArn()

    public fun contextXrayTraceId(): String =
        software.amazon.awscdk.services.apigateway.AccessLogField.contextXrayTraceId()

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.AccessLogField):
        AccessLogField = AccessLogField(cdkObject)

    internal fun unwrap(wrapped: AccessLogField):
        software.amazon.awscdk.services.apigateway.AccessLogField = wrapped.cdkObject
  }
}
