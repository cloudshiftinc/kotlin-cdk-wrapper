@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnIntegrationAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnIntegrationAssociationProps cfnIntegrationAssociationProps =
 * CfnIntegrationAssociationProps.builder()
 * .instanceId("instanceId")
 * .integrationArn("integrationArn")
 * .integrationType("integrationType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-integrationassociation.html)
 */
public interface CfnIntegrationAssociationProps {
  /**
   * The Amazon Resource Name (ARN) of the instance.
   *
   * *Minimum* : `1`
   *
   * *Maximum* : `100`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-integrationassociation.html#cfn-connect-integrationassociation-instanceid)
   */
  public fun instanceId(): String

  /**
   * ARN of the integration being associated with the instance.
   *
   * *Minimum* : `1`
   *
   * *Maximum* : `140`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-integrationassociation.html#cfn-connect-integrationassociation-integrationarn)
   */
  public fun integrationArn(): String

  /**
   * Specifies the integration type to be associated with the instance.
   *
   * *Allowed Values* : `LEX_BOT` | `LAMBDA_FUNCTION`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-integrationassociation.html#cfn-connect-integrationassociation-integrationtype)
   */
  public fun integrationType(): String

  /**
   * A builder for [CfnIntegrationAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param instanceId The Amazon Resource Name (ARN) of the instance. 
     * *Minimum* : `1`
     *
     * *Maximum* : `100`
     */
    public fun instanceId(instanceId: String)

    /**
     * @param integrationArn ARN of the integration being associated with the instance. 
     * *Minimum* : `1`
     *
     * *Maximum* : `140`
     */
    public fun integrationArn(integrationArn: String)

    /**
     * @param integrationType Specifies the integration type to be associated with the instance. 
     * *Allowed Values* : `LEX_BOT` | `LAMBDA_FUNCTION`
     */
    public fun integrationType(integrationType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.connect.CfnIntegrationAssociationProps.Builder =
        software.amazon.awscdk.services.connect.CfnIntegrationAssociationProps.builder()

    /**
     * @param instanceId The Amazon Resource Name (ARN) of the instance. 
     * *Minimum* : `1`
     *
     * *Maximum* : `100`
     */
    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    /**
     * @param integrationArn ARN of the integration being associated with the instance. 
     * *Minimum* : `1`
     *
     * *Maximum* : `140`
     */
    override fun integrationArn(integrationArn: String) {
      cdkBuilder.integrationArn(integrationArn)
    }

    /**
     * @param integrationType Specifies the integration type to be associated with the instance. 
     * *Allowed Values* : `LEX_BOT` | `LAMBDA_FUNCTION`
     */
    override fun integrationType(integrationType: String) {
      cdkBuilder.integrationType(integrationType)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnIntegrationAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnIntegrationAssociationProps,
  ) : CdkObject(cdkObject), CfnIntegrationAssociationProps {
    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `100`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-integrationassociation.html#cfn-connect-integrationassociation-instanceid)
     */
    override fun instanceId(): String = unwrap(this).getInstanceId()

    /**
     * ARN of the integration being associated with the instance.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `140`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-integrationassociation.html#cfn-connect-integrationassociation-integrationarn)
     */
    override fun integrationArn(): String = unwrap(this).getIntegrationArn()

    /**
     * Specifies the integration type to be associated with the instance.
     *
     * *Allowed Values* : `LEX_BOT` | `LAMBDA_FUNCTION`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-integrationassociation.html#cfn-connect-integrationassociation-integrationtype)
     */
    override fun integrationType(): String = unwrap(this).getIntegrationType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIntegrationAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnIntegrationAssociationProps):
        CfnIntegrationAssociationProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnIntegrationAssociationProps

    internal fun unwrap(wrapped: CfnIntegrationAssociationProps):
        software.amazon.awscdk.services.connect.CfnIntegrationAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.connect.CfnIntegrationAssociationProps
  }
}
