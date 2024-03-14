package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIntegrationAssociation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.connect.CfnIntegrationAssociation,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Identifier of the association with an Amazon Connect instance.
   */
  public open fun attrIntegrationAssociationId(): String =
      unwrap(this).getAttrIntegrationAssociationId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the instance.
   */
  public open fun instanceId(): String = unwrap(this).getInstanceId()

  /**
   * The Amazon Resource Name (ARN) of the instance.
   */
  public open fun instanceId(`value`: String) {
    unwrap(this).setInstanceId(`value`)
  }

  /**
   * ARN of the integration being associated with the instance.
   */
  public open fun integrationArn(): String = unwrap(this).getIntegrationArn()

  /**
   * ARN of the integration being associated with the instance.
   */
  public open fun integrationArn(`value`: String) {
    unwrap(this).setIntegrationArn(`value`)
  }

  /**
   * Specifies the integration type to be associated with the instance.
   */
  public open fun integrationType(): String = unwrap(this).getIntegrationType()

  /**
   * Specifies the integration type to be associated with the instance.
   */
  public open fun integrationType(`value`: String) {
    unwrap(this).setIntegrationType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connect.CfnIntegrationAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `100`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-integrationassociation.html#cfn-connect-integrationassociation-instanceid)
     * @param instanceId The Amazon Resource Name (ARN) of the instance. 
     */
    public fun instanceId(instanceId: String)

    /**
     * ARN of the integration being associated with the instance.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `140`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-integrationassociation.html#cfn-connect-integrationassociation-integrationarn)
     * @param integrationArn ARN of the integration being associated with the instance. 
     */
    public fun integrationArn(integrationArn: String)

    /**
     * Specifies the integration type to be associated with the instance.
     *
     * *Allowed Values* : `LEX_BOT` | `LAMBDA_FUNCTION`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-integrationassociation.html#cfn-connect-integrationassociation-integrationtype)
     * @param integrationType Specifies the integration type to be associated with the instance. 
     */
    public fun integrationType(integrationType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.connect.CfnIntegrationAssociation.Builder =
        software.amazon.awscdk.services.connect.CfnIntegrationAssociation.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `100`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-integrationassociation.html#cfn-connect-integrationassociation-instanceid)
     * @param instanceId The Amazon Resource Name (ARN) of the instance. 
     */
    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    /**
     * ARN of the integration being associated with the instance.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `140`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-integrationassociation.html#cfn-connect-integrationassociation-integrationarn)
     * @param integrationArn ARN of the integration being associated with the instance. 
     */
    override fun integrationArn(integrationArn: String) {
      cdkBuilder.integrationArn(integrationArn)
    }

    /**
     * Specifies the integration type to be associated with the instance.
     *
     * *Allowed Values* : `LEX_BOT` | `LAMBDA_FUNCTION`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-integrationassociation.html#cfn-connect-integrationassociation-integrationtype)
     * @param integrationType Specifies the integration type to be associated with the instance. 
     */
    override fun integrationType(integrationType: String) {
      cdkBuilder.integrationType(integrationType)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnIntegrationAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIntegrationAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIntegrationAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnIntegrationAssociation):
        CfnIntegrationAssociation = CfnIntegrationAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnIntegrationAssociation):
        software.amazon.awscdk.services.connect.CfnIntegrationAssociation = wrapped.cdkObject
  }
}
