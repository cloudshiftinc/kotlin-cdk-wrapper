package io.cloudshiftdev.awscdk.services.robomaker

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

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
        CfnSimulationApplicationVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSimulationApplicationVersionProps):
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps
  }
}
