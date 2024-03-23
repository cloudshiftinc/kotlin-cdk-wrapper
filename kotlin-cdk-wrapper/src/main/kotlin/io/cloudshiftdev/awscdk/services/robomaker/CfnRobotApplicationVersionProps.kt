@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.robomaker

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnRobotApplicationVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.robomaker.*;
 * CfnRobotApplicationVersionProps cfnRobotApplicationVersionProps =
 * CfnRobotApplicationVersionProps.builder()
 * .application("application")
 * // the properties below are optional
 * .currentRevisionId("currentRevisionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplicationversion.html)
 */
public interface CfnRobotApplicationVersionProps {
  /**
   * The application information for the robot application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplicationversion.html#cfn-robomaker-robotapplicationversion-application)
   */
  public fun application(): String

  /**
   * The current revision id for the robot application.
   *
   * If you provide a value and it matches the latest revision ID, a new version will be created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplicationversion.html#cfn-robomaker-robotapplicationversion-currentrevisionid)
   */
  public fun currentRevisionId(): String? = unwrap(this).getCurrentRevisionId()

  /**
   * A builder for [CfnRobotApplicationVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param application The application information for the robot application. 
     */
    public fun application(application: String)

    /**
     * @param currentRevisionId The current revision id for the robot application.
     * If you provide a value and it matches the latest revision ID, a new version will be created.
     */
    public fun currentRevisionId(currentRevisionId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps.Builder =
        software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps.builder()

    /**
     * @param application The application information for the robot application. 
     */
    override fun application(application: String) {
      cdkBuilder.application(application)
    }

    /**
     * @param currentRevisionId The current revision id for the robot application.
     * If you provide a value and it matches the latest revision ID, a new version will be created.
     */
    override fun currentRevisionId(currentRevisionId: String) {
      cdkBuilder.currentRevisionId(currentRevisionId)
    }

    public fun build(): software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps,
  ) : CdkObject(cdkObject), CfnRobotApplicationVersionProps {
    /**
     * The application information for the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplicationversion.html#cfn-robomaker-robotapplicationversion-application)
     */
    override fun application(): String = unwrap(this).getApplication()

    /**
     * The current revision id for the robot application.
     *
     * If you provide a value and it matches the latest revision ID, a new version will be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplicationversion.html#cfn-robomaker-robotapplicationversion-currentrevisionid)
     */
    override fun currentRevisionId(): String? = unwrap(this).getCurrentRevisionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRobotApplicationVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps):
        CfnRobotApplicationVersionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnRobotApplicationVersionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRobotApplicationVersionProps):
        software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps
  }
}
