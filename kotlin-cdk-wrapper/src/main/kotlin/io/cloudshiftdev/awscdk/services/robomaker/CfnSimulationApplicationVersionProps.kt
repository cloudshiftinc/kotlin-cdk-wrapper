@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.robomaker

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnSimulationApplicationVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.robomaker.*;
 * CfnSimulationApplicationVersionProps cfnSimulationApplicationVersionProps =
 * CfnSimulationApplicationVersionProps.builder()
 * .application("application")
 * // the properties below are optional
 * .currentRevisionId("currentRevisionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplicationversion.html)
 */
public interface CfnSimulationApplicationVersionProps {
  /**
   * The application information for the simulation application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplicationversion.html#cfn-robomaker-simulationapplicationversion-application)
   */
  public fun application(): String

  /**
   * The current revision id for the simulation application.
   *
   * If you provide a value and it matches the latest revision ID, a new version will be created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplicationversion.html#cfn-robomaker-simulationapplicationversion-currentrevisionid)
   */
  public fun currentRevisionId(): String? = unwrap(this).getCurrentRevisionId()

  /**
   * A builder for [CfnSimulationApplicationVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param application The application information for the simulation application. 
     */
    public fun application(application: String)

    /**
     * @param currentRevisionId The current revision id for the simulation application.
     * If you provide a value and it matches the latest revision ID, a new version will be created.
     */
    public fun currentRevisionId(currentRevisionId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps.Builder =
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps.builder()

    /**
     * @param application The application information for the simulation application. 
     */
    override fun application(application: String) {
      cdkBuilder.application(application)
    }

    /**
     * @param currentRevisionId The current revision id for the simulation application.
     * If you provide a value and it matches the latest revision ID, a new version will be created.
     */
    override fun currentRevisionId(currentRevisionId: String) {
      cdkBuilder.currentRevisionId(currentRevisionId)
    }

    public fun build():
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps,
  ) : CdkObject(cdkObject), CfnSimulationApplicationVersionProps {
    /**
     * The application information for the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplicationversion.html#cfn-robomaker-simulationapplicationversion-application)
     */
    override fun application(): String = unwrap(this).getApplication()

    /**
     * The current revision id for the simulation application.
     *
     * If you provide a value and it matches the latest revision ID, a new version will be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplicationversion.html#cfn-robomaker-simulationapplicationversion-currentrevisionid)
     */
    override fun currentRevisionId(): String? = unwrap(this).getCurrentRevisionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnSimulationApplicationVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps):
        CfnSimulationApplicationVersionProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnSimulationApplicationVersionProps

    internal fun unwrap(wrapped: CfnSimulationApplicationVersionProps):
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps
  }
}
