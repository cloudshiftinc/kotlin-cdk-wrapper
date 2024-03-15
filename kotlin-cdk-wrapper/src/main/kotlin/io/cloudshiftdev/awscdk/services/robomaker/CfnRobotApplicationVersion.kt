@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.robomaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::RoboMaker::RobotApplicationVersion` resource creates an AWS RoboMaker robot version.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.robomaker.*;
 * CfnRobotApplicationVersion cfnRobotApplicationVersion =
 * CfnRobotApplicationVersion.Builder.create(this, "MyCfnRobotApplicationVersion")
 * .application("application")
 * // the properties below are optional
 * .currentRevisionId("currentRevisionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplicationversion.html)
 */
public open class CfnRobotApplicationVersion internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The application information for the robot application.
   */
  public open fun application(): String = unwrap(this).getApplication()

  /**
   * The application information for the robot application.
   */
  public open fun application(`value`: String) {
    unwrap(this).setApplication(`value`)
  }

  /**
   * The robot application version.
   */
  public open fun attrApplicationVersion(): String = unwrap(this).getAttrApplicationVersion()

  /**
   * The Amazon Resource Name (ARN) of the robot application version.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The current revision id for the robot application.
   */
  public open fun currentRevisionId(): String? = unwrap(this).getCurrentRevisionId()

  /**
   * The current revision id for the robot application.
   */
  public open fun currentRevisionId(`value`: String) {
    unwrap(this).setCurrentRevisionId(`value`)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.robomaker.CfnRobotApplicationVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The application information for the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplicationversion.html#cfn-robomaker-robotapplicationversion-application)
     * @param application The application information for the robot application. 
     */
    public fun application(application: String)

    /**
     * The current revision id for the robot application.
     *
     * If you provide a value and it matches the latest revision ID, a new version will be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplicationversion.html#cfn-robomaker-robotapplicationversion-currentrevisionid)
     * @param currentRevisionId The current revision id for the robot application. 
     */
    public fun currentRevisionId(currentRevisionId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion.Builder =
        software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion.Builder.create(scope,
        id)

    /**
     * The application information for the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplicationversion.html#cfn-robomaker-robotapplicationversion-application)
     * @param application The application information for the robot application. 
     */
    override fun application(application: String) {
      cdkBuilder.application(application)
    }

    /**
     * The current revision id for the robot application.
     *
     * If you provide a value and it matches the latest revision ID, a new version will be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplicationversion.html#cfn-robomaker-robotapplicationversion-currentrevisionid)
     * @param currentRevisionId The current revision id for the robot application. 
     */
    override fun currentRevisionId(currentRevisionId: String) {
      cdkBuilder.currentRevisionId(currentRevisionId)
    }

    public fun build(): software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRobotApplicationVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRobotApplicationVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion):
        CfnRobotApplicationVersion = CfnRobotApplicationVersion(cdkObject)

    internal fun unwrap(wrapped: CfnRobotApplicationVersion):
        software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion = wrapped.cdkObject
  }
}
