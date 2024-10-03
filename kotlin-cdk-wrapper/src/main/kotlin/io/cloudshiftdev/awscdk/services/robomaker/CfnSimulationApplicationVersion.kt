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
 * The `AWS::RoboMaker::SimulationApplicationVersion` resource creates a version of an AWS RoboMaker
 * simulation application.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.robomaker.*;
 * CfnSimulationApplicationVersion cfnSimulationApplicationVersion =
 * CfnSimulationApplicationVersion.Builder.create(this, "MyCfnSimulationApplicationVersion")
 * .application("application")
 * // the properties below are optional
 * .currentRevisionId("currentRevisionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplicationversion.html)
 */
public open class CfnSimulationApplicationVersion(
  cdkObject: software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSimulationApplicationVersionProps,
  ) :
      this(software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSimulationApplicationVersionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSimulationApplicationVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSimulationApplicationVersionProps(props)
  )

  /**
   * The application information for the simulation application.
   */
  public open fun application(): String = unwrap(this).getApplication()

  /**
   * The application information for the simulation application.
   */
  public open fun application(`value`: String) {
    unwrap(this).setApplication(`value`)
  }

  /**
   * The simulation application version.
   */
  public open fun attrApplicationVersion(): String = unwrap(this).getAttrApplicationVersion()

  /**
   * The Amazon Resource Name (ARN) of the simulation application version.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The current revision id for the simulation application.
   */
  public open fun currentRevisionId(): String? = unwrap(this).getCurrentRevisionId()

  /**
   * The current revision id for the simulation application.
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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.robomaker.CfnSimulationApplicationVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The application information for the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplicationversion.html#cfn-robomaker-simulationapplicationversion-application)
     * @param application The application information for the simulation application. 
     */
    public fun application(application: String)

    /**
     * The current revision id for the simulation application.
     *
     * If you provide a value and it matches the latest revision ID, a new version will be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplicationversion.html#cfn-robomaker-simulationapplicationversion-currentrevisionid)
     * @param currentRevisionId The current revision id for the simulation application. 
     */
    public fun currentRevisionId(currentRevisionId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion.Builder =
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion.Builder.create(scope,
        id)

    /**
     * The application information for the simulation application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplicationversion.html#cfn-robomaker-simulationapplicationversion-application)
     * @param application The application information for the simulation application. 
     */
    override fun application(application: String) {
      cdkBuilder.application(application)
    }

    /**
     * The current revision id for the simulation application.
     *
     * If you provide a value and it matches the latest revision ID, a new version will be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplicationversion.html#cfn-robomaker-simulationapplicationversion-currentrevisionid)
     * @param currentRevisionId The current revision id for the simulation application. 
     */
    override fun currentRevisionId(currentRevisionId: String) {
      cdkBuilder.currentRevisionId(currentRevisionId)
    }

    public fun build(): software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSimulationApplicationVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSimulationApplicationVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion):
        CfnSimulationApplicationVersion = CfnSimulationApplicationVersion(cdkObject)

    internal fun unwrap(wrapped: CfnSimulationApplicationVersion):
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion =
        wrapped.cdkObject as
        software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion
  }
}
