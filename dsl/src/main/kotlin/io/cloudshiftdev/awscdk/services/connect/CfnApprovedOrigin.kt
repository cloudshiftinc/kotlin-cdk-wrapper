package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApprovedOrigin internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.connect.CfnApprovedOrigin,
) : CfnResource(cdkObject), IInspectable {
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
   * Domain name to be added to the allow-list of the instance.
   */
  public open fun origin(): String = unwrap(this).getOrigin()

  /**
   * Domain name to be added to the allow-list of the instance.
   */
  public open fun origin(`value`: String) {
    unwrap(this).setOrigin(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connect.CfnApprovedOrigin].
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-approvedorigin.html#cfn-connect-approvedorigin-instanceid)
     * @param instanceId The Amazon Resource Name (ARN) of the instance. 
     */
    public fun instanceId(instanceId: String)

    /**
     * Domain name to be added to the allow-list of the instance.
     *
     * *Maximum* : `267`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-approvedorigin.html#cfn-connect-approvedorigin-origin)
     * @param origin Domain name to be added to the allow-list of the instance. 
     */
    public fun origin(origin: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnApprovedOrigin.Builder =
        software.amazon.awscdk.services.connect.CfnApprovedOrigin.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `100`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-approvedorigin.html#cfn-connect-approvedorigin-instanceid)
     * @param instanceId The Amazon Resource Name (ARN) of the instance. 
     */
    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    /**
     * Domain name to be added to the allow-list of the instance.
     *
     * *Maximum* : `267`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-approvedorigin.html#cfn-connect-approvedorigin-origin)
     * @param origin Domain name to be added to the allow-list of the instance. 
     */
    override fun origin(origin: String) {
      cdkBuilder.origin(origin)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnApprovedOrigin =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApprovedOrigin {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApprovedOrigin(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnApprovedOrigin):
        CfnApprovedOrigin = CfnApprovedOrigin(cdkObject)

    internal fun unwrap(wrapped: CfnApprovedOrigin):
        software.amazon.awscdk.services.connect.CfnApprovedOrigin = wrapped.cdkObject
  }
}