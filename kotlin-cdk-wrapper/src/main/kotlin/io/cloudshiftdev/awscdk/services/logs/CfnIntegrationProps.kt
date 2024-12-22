@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnIntegration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * CfnIntegrationProps cfnIntegrationProps = CfnIntegrationProps.builder()
 * .integrationName("integrationName")
 * .integrationType("integrationType")
 * .resourceConfig(ResourceConfigProperty.builder()
 * .openSearchResourceConfig(OpenSearchResourceConfigProperty.builder()
 * .dashboardViewerPrincipals(List.of("dashboardViewerPrincipals"))
 * .dataSourceRoleArn("dataSourceRoleArn")
 * // the properties below are optional
 * .applicationArn("applicationArn")
 * .kmsKeyArn("kmsKeyArn")
 * .retentionDays(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-integration.html)
 */
public interface CfnIntegrationProps {
  /**
   * The name of this integration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-integration.html#cfn-logs-integration-integrationname)
   */
  public fun integrationName(): String

  /**
   * The type of integration.
   *
   * Integrations with OpenSearch Service have the type `OPENSEARCH` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-integration.html#cfn-logs-integration-integrationtype)
   */
  public fun integrationType(): String

  /**
   * This structure contains configuration details about an integration between CloudWatch Logs and
   * another entity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-integration.html#cfn-logs-integration-resourceconfig)
   */
  public fun resourceConfig(): Any

  /**
   * A builder for [CfnIntegrationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param integrationName The name of this integration. 
     */
    public fun integrationName(integrationName: String)

    /**
     * @param integrationType The type of integration. 
     * Integrations with OpenSearch Service have the type `OPENSEARCH` .
     */
    public fun integrationType(integrationType: String)

    /**
     * @param resourceConfig This structure contains configuration details about an integration
     * between CloudWatch Logs and another entity. 
     */
    public fun resourceConfig(resourceConfig: IResolvable)

    /**
     * @param resourceConfig This structure contains configuration details about an integration
     * between CloudWatch Logs and another entity. 
     */
    public fun resourceConfig(resourceConfig: CfnIntegration.ResourceConfigProperty)

    /**
     * @param resourceConfig This structure contains configuration details about an integration
     * between CloudWatch Logs and another entity. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75e6b8a3fe29af7e195058fafc79c2ce1c90afe6ca8a9f30908dc7561ce48171")
    public
        fun resourceConfig(resourceConfig: CfnIntegration.ResourceConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnIntegrationProps.Builder =
        software.amazon.awscdk.services.logs.CfnIntegrationProps.builder()

    /**
     * @param integrationName The name of this integration. 
     */
    override fun integrationName(integrationName: String) {
      cdkBuilder.integrationName(integrationName)
    }

    /**
     * @param integrationType The type of integration. 
     * Integrations with OpenSearch Service have the type `OPENSEARCH` .
     */
    override fun integrationType(integrationType: String) {
      cdkBuilder.integrationType(integrationType)
    }

    /**
     * @param resourceConfig This structure contains configuration details about an integration
     * between CloudWatch Logs and another entity. 
     */
    override fun resourceConfig(resourceConfig: IResolvable) {
      cdkBuilder.resourceConfig(resourceConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param resourceConfig This structure contains configuration details about an integration
     * between CloudWatch Logs and another entity. 
     */
    override fun resourceConfig(resourceConfig: CfnIntegration.ResourceConfigProperty) {
      cdkBuilder.resourceConfig(resourceConfig.let(CfnIntegration.ResourceConfigProperty.Companion::unwrap))
    }

    /**
     * @param resourceConfig This structure contains configuration details about an integration
     * between CloudWatch Logs and another entity. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75e6b8a3fe29af7e195058fafc79c2ce1c90afe6ca8a9f30908dc7561ce48171")
    override
        fun resourceConfig(resourceConfig: CfnIntegration.ResourceConfigProperty.Builder.() -> Unit):
        Unit = resourceConfig(CfnIntegration.ResourceConfigProperty(resourceConfig))

    public fun build(): software.amazon.awscdk.services.logs.CfnIntegrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.CfnIntegrationProps,
  ) : CdkObject(cdkObject),
      CfnIntegrationProps {
    /**
     * The name of this integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-integration.html#cfn-logs-integration-integrationname)
     */
    override fun integrationName(): String = unwrap(this).getIntegrationName()

    /**
     * The type of integration.
     *
     * Integrations with OpenSearch Service have the type `OPENSEARCH` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-integration.html#cfn-logs-integration-integrationtype)
     */
    override fun integrationType(): String = unwrap(this).getIntegrationType()

    /**
     * This structure contains configuration details about an integration between CloudWatch Logs
     * and another entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-integration.html#cfn-logs-integration-resourceconfig)
     */
    override fun resourceConfig(): Any = unwrap(this).getResourceConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnIntegrationProps):
        CfnIntegrationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnIntegrationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIntegrationProps):
        software.amazon.awscdk.services.logs.CfnIntegrationProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.logs.CfnIntegrationProps
  }
}
