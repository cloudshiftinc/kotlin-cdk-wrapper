@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspacesthinclient

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnEnvironment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.workspacesthinclient.*;
 * CfnEnvironmentProps cfnEnvironmentProps = CfnEnvironmentProps.builder()
 * .desktopArn("desktopArn")
 * // the properties below are optional
 * .desiredSoftwareSetId("desiredSoftwareSetId")
 * .desktopEndpoint("desktopEndpoint")
 * .kmsKeyArn("kmsKeyArn")
 * .maintenanceWindow(MaintenanceWindowProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .applyTimeOf("applyTimeOf")
 * .daysOfTheWeek(List.of("daysOfTheWeek"))
 * .endTimeHour(123)
 * .endTimeMinute(123)
 * .startTimeHour(123)
 * .startTimeMinute(123)
 * .build())
 * .name("name")
 * .softwareSetUpdateMode("softwareSetUpdateMode")
 * .softwareSetUpdateSchedule("softwareSetUpdateSchedule")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html)
 */
public interface CfnEnvironmentProps {
  /**
   * The ID of the software set to apply.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-desiredsoftwaresetid)
   */
  public fun desiredSoftwareSetId(): String? = unwrap(this).getDesiredSoftwareSetId()

  /**
   * The Amazon Resource Name (ARN) of the desktop to stream from Amazon WorkSpaces, WorkSpaces Web,
   * or AppStream 2.0.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-desktoparn)
   */
  public fun desktopArn(): String

  /**
   * The URL for the identity provider login (only for environments that use AppStream 2.0).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-desktopendpoint)
   */
  public fun desktopEndpoint(): String? = unwrap(this).getDesktopEndpoint()

  /**
   * The Amazon Resource Name (ARN) of the AWS Key Management Service key used to encrypt the
   * environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-kmskeyarn)
   */
  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * A specification for a time window to apply software updates.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-maintenancewindow)
   */
  public fun maintenanceWindow(): Any? = unwrap(this).getMaintenanceWindow()

  /**
   * The name of the environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * An option to define which software updates to apply.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-softwaresetupdatemode)
   */
  public fun softwareSetUpdateMode(): String? = unwrap(this).getSoftwareSetUpdateMode()

  /**
   * An option to define if software updates should be applied within a maintenance window.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-softwaresetupdateschedule)
   */
  public fun softwareSetUpdateSchedule(): String? = unwrap(this).getSoftwareSetUpdateSchedule()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnEnvironmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param desiredSoftwareSetId The ID of the software set to apply.
     */
    public fun desiredSoftwareSetId(desiredSoftwareSetId: String)

    /**
     * @param desktopArn The Amazon Resource Name (ARN) of the desktop to stream from Amazon
     * WorkSpaces, WorkSpaces Web, or AppStream 2.0. 
     */
    public fun desktopArn(desktopArn: String)

    /**
     * @param desktopEndpoint The URL for the identity provider login (only for environments that
     * use AppStream 2.0).
     */
    public fun desktopEndpoint(desktopEndpoint: String)

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS Key Management Service key used to
     * encrypt the environment.
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * @param maintenanceWindow A specification for a time window to apply software updates.
     */
    public fun maintenanceWindow(maintenanceWindow: IResolvable)

    /**
     * @param maintenanceWindow A specification for a time window to apply software updates.
     */
    public fun maintenanceWindow(maintenanceWindow: CfnEnvironment.MaintenanceWindowProperty)

    /**
     * @param maintenanceWindow A specification for a time window to apply software updates.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("587eeb0625dce4bfdd9c67a264f02c68b6d8ed34e035feec04d1a3186819993a")
    public
        fun maintenanceWindow(maintenanceWindow: CfnEnvironment.MaintenanceWindowProperty.Builder.() -> Unit)

    /**
     * @param name The name of the environment.
     */
    public fun name(name: String)

    /**
     * @param softwareSetUpdateMode An option to define which software updates to apply.
     */
    public fun softwareSetUpdateMode(softwareSetUpdateMode: String)

    /**
     * @param softwareSetUpdateSchedule An option to define if software updates should be applied
     * within a maintenance window.
     */
    public fun softwareSetUpdateSchedule(softwareSetUpdateSchedule: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspacesthinclient.CfnEnvironmentProps.Builder =
        software.amazon.awscdk.services.workspacesthinclient.CfnEnvironmentProps.builder()

    /**
     * @param desiredSoftwareSetId The ID of the software set to apply.
     */
    override fun desiredSoftwareSetId(desiredSoftwareSetId: String) {
      cdkBuilder.desiredSoftwareSetId(desiredSoftwareSetId)
    }

    /**
     * @param desktopArn The Amazon Resource Name (ARN) of the desktop to stream from Amazon
     * WorkSpaces, WorkSpaces Web, or AppStream 2.0. 
     */
    override fun desktopArn(desktopArn: String) {
      cdkBuilder.desktopArn(desktopArn)
    }

    /**
     * @param desktopEndpoint The URL for the identity provider login (only for environments that
     * use AppStream 2.0).
     */
    override fun desktopEndpoint(desktopEndpoint: String) {
      cdkBuilder.desktopEndpoint(desktopEndpoint)
    }

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS Key Management Service key used to
     * encrypt the environment.
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * @param maintenanceWindow A specification for a time window to apply software updates.
     */
    override fun maintenanceWindow(maintenanceWindow: IResolvable) {
      cdkBuilder.maintenanceWindow(maintenanceWindow.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param maintenanceWindow A specification for a time window to apply software updates.
     */
    override fun maintenanceWindow(maintenanceWindow: CfnEnvironment.MaintenanceWindowProperty) {
      cdkBuilder.maintenanceWindow(maintenanceWindow.let(CfnEnvironment.MaintenanceWindowProperty.Companion::unwrap))
    }

    /**
     * @param maintenanceWindow A specification for a time window to apply software updates.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("587eeb0625dce4bfdd9c67a264f02c68b6d8ed34e035feec04d1a3186819993a")
    override
        fun maintenanceWindow(maintenanceWindow: CfnEnvironment.MaintenanceWindowProperty.Builder.() -> Unit):
        Unit = maintenanceWindow(CfnEnvironment.MaintenanceWindowProperty(maintenanceWindow))

    /**
     * @param name The name of the environment.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param softwareSetUpdateMode An option to define which software updates to apply.
     */
    override fun softwareSetUpdateMode(softwareSetUpdateMode: String) {
      cdkBuilder.softwareSetUpdateMode(softwareSetUpdateMode)
    }

    /**
     * @param softwareSetUpdateSchedule An option to define if software updates should be applied
     * within a maintenance window.
     */
    override fun softwareSetUpdateSchedule(softwareSetUpdateSchedule: String) {
      cdkBuilder.softwareSetUpdateSchedule(softwareSetUpdateSchedule)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.workspacesthinclient.CfnEnvironmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.workspacesthinclient.CfnEnvironmentProps,
  ) : CdkObject(cdkObject), CfnEnvironmentProps {
    /**
     * The ID of the software set to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-desiredsoftwaresetid)
     */
    override fun desiredSoftwareSetId(): String? = unwrap(this).getDesiredSoftwareSetId()

    /**
     * The Amazon Resource Name (ARN) of the desktop to stream from Amazon WorkSpaces, WorkSpaces
     * Web, or AppStream 2.0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-desktoparn)
     */
    override fun desktopArn(): String = unwrap(this).getDesktopArn()

    /**
     * The URL for the identity provider login (only for environments that use AppStream 2.0).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-desktopendpoint)
     */
    override fun desktopEndpoint(): String? = unwrap(this).getDesktopEndpoint()

    /**
     * The Amazon Resource Name (ARN) of the AWS Key Management Service key used to encrypt the
     * environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-kmskeyarn)
     */
    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * A specification for a time window to apply software updates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-maintenancewindow)
     */
    override fun maintenanceWindow(): Any? = unwrap(this).getMaintenanceWindow()

    /**
     * The name of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * An option to define which software updates to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-softwaresetupdatemode)
     */
    override fun softwareSetUpdateMode(): String? = unwrap(this).getSoftwareSetUpdateMode()

    /**
     * An option to define if software updates should be applied within a maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-softwaresetupdateschedule)
     */
    override fun softwareSetUpdateSchedule(): String? = unwrap(this).getSoftwareSetUpdateSchedule()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEnvironmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.workspacesthinclient.CfnEnvironmentProps):
        CfnEnvironmentProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEnvironmentProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentProps):
        software.amazon.awscdk.services.workspacesthinclient.CfnEnvironmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.workspacesthinclient.CfnEnvironmentProps
  }
}
