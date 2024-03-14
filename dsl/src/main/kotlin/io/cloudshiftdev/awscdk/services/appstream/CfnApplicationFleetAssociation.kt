package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplicationFleetAssociation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociation,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The ARN of the application.
   */
  public open fun applicationArn(): String = unwrap(this).getApplicationArn()

  /**
   * The ARN of the application.
   */
  public open fun applicationArn(`value`: String) {
    unwrap(this).setApplicationArn(`value`)
  }

  /**
   * The name of the fleet.
   */
  public open fun fleetName(): String = unwrap(this).getFleetName()

  /**
   * The name of the fleet.
   */
  public open fun fleetName(`value`: String) {
    unwrap(this).setFleetName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.appstream.CfnApplicationFleetAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ARN of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationfleetassociation.html#cfn-appstream-applicationfleetassociation-applicationarn)
     * @param applicationArn The ARN of the application. 
     */
    public fun applicationArn(applicationArn: String)

    /**
     * The name of the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationfleetassociation.html#cfn-appstream-applicationfleetassociation-fleetname)
     * @param fleetName The name of the fleet. 
     */
    public fun fleetName(fleetName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociation.Builder =
        software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociation.Builder.create(scope,
        id)

    /**
     * The ARN of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationfleetassociation.html#cfn-appstream-applicationfleetassociation-applicationarn)
     * @param applicationArn The ARN of the application. 
     */
    override fun applicationArn(applicationArn: String) {
      cdkBuilder.applicationArn(applicationArn)
    }

    /**
     * The name of the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationfleetassociation.html#cfn-appstream-applicationfleetassociation-fleetname)
     * @param fleetName The name of the fleet. 
     */
    override fun fleetName(fleetName: String) {
      cdkBuilder.fleetName(fleetName)
    }

    public fun build(): software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplicationFleetAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplicationFleetAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociation):
        CfnApplicationFleetAssociation = CfnApplicationFleetAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationFleetAssociation):
        software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociation = wrapped.cdkObject
  }
}