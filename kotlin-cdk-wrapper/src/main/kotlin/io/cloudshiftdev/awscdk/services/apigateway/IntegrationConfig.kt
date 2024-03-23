@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Result of binding an Integration to a Method.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Role role;
 * VpcLink vpcLink;
 * IntegrationConfig integrationConfig = IntegrationConfig.builder()
 * .type(IntegrationType.AWS)
 * // the properties below are optional
 * .deploymentToken("deploymentToken")
 * .integrationHttpMethod("integrationHttpMethod")
 * .options(IntegrationOptions.builder()
 * .cacheKeyParameters(List.of("cacheKeyParameters"))
 * .cacheNamespace("cacheNamespace")
 * .connectionType(ConnectionType.INTERNET)
 * .contentHandling(ContentHandling.CONVERT_TO_BINARY)
 * .credentialsPassthrough(false)
 * .credentialsRole(role)
 * .integrationResponses(List.of(IntegrationResponse.builder()
 * .statusCode("statusCode")
 * // the properties below are optional
 * .contentHandling(ContentHandling.CONVERT_TO_BINARY)
 * .responseParameters(Map.of(
 * "responseParametersKey", "responseParameters"))
 * .responseTemplates(Map.of(
 * "responseTemplatesKey", "responseTemplates"))
 * .selectionPattern("selectionPattern")
 * .build()))
 * .passthroughBehavior(PassthroughBehavior.WHEN_NO_MATCH)
 * .requestParameters(Map.of(
 * "requestParametersKey", "requestParameters"))
 * .requestTemplates(Map.of(
 * "requestTemplatesKey", "requestTemplates"))
 * .timeout(Duration.minutes(30))
 * .vpcLink(vpcLink)
 * .build())
 * .uri("uri")
 * .build();
 * ```
 */
public interface IntegrationConfig {
  /**
   * This value is included in computing the Deployment's fingerprint.
   *
   * When the fingerprint
   * changes, a new deployment is triggered.
   * This property should contain values associated with the Integration that upon changing
   * should trigger a fresh the Deployment needs to be refreshed.
   *
   * Default: undefined deployments are not triggered for any change to this integration.
   */
  public fun deploymentToken(): String? = unwrap(this).getDeploymentToken()

  /**
   * The integration's HTTP method type.
   *
   * Required unless you use a MOCK integration.
   *
   * Default: - no integration method specified.
   */
  public fun integrationHttpMethod(): String? = unwrap(this).getIntegrationHttpMethod()

  /**
   * Integration options.
   *
   * Default: - no integration options
   */
  public fun options(): IntegrationOptions? =
      unwrap(this).getOptions()?.let(IntegrationOptions::wrap)

  /**
   * Specifies an API method integration type.
   */
  public fun type(): IntegrationType

  /**
   * The Uniform Resource Identifier (URI) for the integration.
   *
   * Default: - no URI. Usually applies to MOCK integration
   *
   * [Documentation](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/#uri)
   */
  public fun uri(): String? = unwrap(this).getUri()

  /**
   * A builder for [IntegrationConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deploymentToken This value is included in computing the Deployment's fingerprint.
     * When the fingerprint
     * changes, a new deployment is triggered.
     * This property should contain values associated with the Integration that upon changing
     * should trigger a fresh the Deployment needs to be refreshed.
     */
    public fun deploymentToken(deploymentToken: String)

    /**
     * @param integrationHttpMethod The integration's HTTP method type.
     * Required unless you use a MOCK integration.
     */
    public fun integrationHttpMethod(integrationHttpMethod: String)

    /**
     * @param options Integration options.
     */
    public fun options(options: IntegrationOptions)

    /**
     * @param options Integration options.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8cc2787d31e548d4bf39995796c58d01fe7feb0418660b4a0d8ed339d9c481e2")
    public fun options(options: IntegrationOptions.Builder.() -> Unit)

    /**
     * @param type Specifies an API method integration type. 
     */
    public fun type(type: IntegrationType)

    /**
     * @param uri The Uniform Resource Identifier (URI) for the integration.
     */
    public fun uri(uri: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.IntegrationConfig.Builder =
        software.amazon.awscdk.services.apigateway.IntegrationConfig.builder()

    /**
     * @param deploymentToken This value is included in computing the Deployment's fingerprint.
     * When the fingerprint
     * changes, a new deployment is triggered.
     * This property should contain values associated with the Integration that upon changing
     * should trigger a fresh the Deployment needs to be refreshed.
     */
    override fun deploymentToken(deploymentToken: String) {
      cdkBuilder.deploymentToken(deploymentToken)
    }

    /**
     * @param integrationHttpMethod The integration's HTTP method type.
     * Required unless you use a MOCK integration.
     */
    override fun integrationHttpMethod(integrationHttpMethod: String) {
      cdkBuilder.integrationHttpMethod(integrationHttpMethod)
    }

    /**
     * @param options Integration options.
     */
    override fun options(options: IntegrationOptions) {
      cdkBuilder.options(options.let(IntegrationOptions::unwrap))
    }

    /**
     * @param options Integration options.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8cc2787d31e548d4bf39995796c58d01fe7feb0418660b4a0d8ed339d9c481e2")
    override fun options(options: IntegrationOptions.Builder.() -> Unit): Unit =
        options(IntegrationOptions(options))

    /**
     * @param type Specifies an API method integration type. 
     */
    override fun type(type: IntegrationType) {
      cdkBuilder.type(type.let(IntegrationType::unwrap))
    }

    /**
     * @param uri The Uniform Resource Identifier (URI) for the integration.
     */
    override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.IntegrationConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.IntegrationConfig,
  ) : CdkObject(cdkObject), IntegrationConfig {
    /**
     * This value is included in computing the Deployment's fingerprint.
     *
     * When the fingerprint
     * changes, a new deployment is triggered.
     * This property should contain values associated with the Integration that upon changing
     * should trigger a fresh the Deployment needs to be refreshed.
     *
     * Default: undefined deployments are not triggered for any change to this integration.
     */
    override fun deploymentToken(): String? = unwrap(this).getDeploymentToken()

    /**
     * The integration's HTTP method type.
     *
     * Required unless you use a MOCK integration.
     *
     * Default: - no integration method specified.
     */
    override fun integrationHttpMethod(): String? = unwrap(this).getIntegrationHttpMethod()

    /**
     * Integration options.
     *
     * Default: - no integration options
     */
    override fun options(): IntegrationOptions? =
        unwrap(this).getOptions()?.let(IntegrationOptions::wrap)

    /**
     * Specifies an API method integration type.
     */
    override fun type(): IntegrationType = unwrap(this).getType().let(IntegrationType::wrap)

    /**
     * The Uniform Resource Identifier (URI) for the integration.
     *
     * Default: - no URI. Usually applies to MOCK integration
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/#uri)
     */
    override fun uri(): String? = unwrap(this).getUri()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): IntegrationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IntegrationConfig):
        IntegrationConfig = CdkObjectWrappers.wrap(cdkObject) as? IntegrationConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IntegrationConfig):
        software.amazon.awscdk.services.apigateway.IntegrationConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.IntegrationConfig
  }
}
