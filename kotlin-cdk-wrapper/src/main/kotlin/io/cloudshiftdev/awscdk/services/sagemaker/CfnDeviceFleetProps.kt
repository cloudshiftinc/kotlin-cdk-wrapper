@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

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
 * Properties for defining a `CfnDeviceFleet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnDeviceFleetProps cfnDeviceFleetProps = CfnDeviceFleetProps.builder()
 * .deviceFleetName("deviceFleetName")
 * .outputConfig(EdgeOutputConfigProperty.builder()
 * .s3OutputLocation("s3OutputLocation")
 * // the properties below are optional
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .roleArn("roleArn")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html)
 */
public interface CfnDeviceFleetProps {
  /**
   * A description of the fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Name of the device fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-devicefleetname)
   */
  public fun deviceFleetName(): String

  /**
   * The output configuration for storing sample data collected by the fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-outputconfig)
   */
  public fun outputConfig(): Any

  /**
   * The Amazon Resource Name (ARN) that has access to AWS Internet of Things (IoT).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-rolearn)
   */
  public fun roleArn(): String

  /**
   * An array of key-value pairs that contain metadata to help you categorize and organize your
   * device fleets.
   *
   * Each tag consists of a key and a value, both of which you define.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDeviceFleetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the fleet.
     */
    public fun description(description: String)

    /**
     * @param deviceFleetName Name of the device fleet. 
     */
    public fun deviceFleetName(deviceFleetName: String)

    /**
     * @param outputConfig The output configuration for storing sample data collected by the fleet. 
     */
    public fun outputConfig(outputConfig: IResolvable)

    /**
     * @param outputConfig The output configuration for storing sample data collected by the fleet. 
     */
    public fun outputConfig(outputConfig: CfnDeviceFleet.EdgeOutputConfigProperty)

    /**
     * @param outputConfig The output configuration for storing sample data collected by the fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("daffec862206a87e02d56b15c666c335c0e75534e9d3debb7dceabca1235918f")
    public
        fun outputConfig(outputConfig: CfnDeviceFleet.EdgeOutputConfigProperty.Builder.() -> Unit)

    /**
     * @param roleArn The Amazon Resource Name (ARN) that has access to AWS Internet of Things
     * (IoT). 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param tags An array of key-value pairs that contain metadata to help you categorize and
     * organize your device fleets.
     * Each tag consists of a key and a value, both of which you define.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs that contain metadata to help you categorize and
     * organize your device fleets.
     * Each tag consists of a key and a value, both of which you define.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnDeviceFleetProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnDeviceFleetProps.builder()

    /**
     * @param description A description of the fleet.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param deviceFleetName Name of the device fleet. 
     */
    override fun deviceFleetName(deviceFleetName: String) {
      cdkBuilder.deviceFleetName(deviceFleetName)
    }

    /**
     * @param outputConfig The output configuration for storing sample data collected by the fleet. 
     */
    override fun outputConfig(outputConfig: IResolvable) {
      cdkBuilder.outputConfig(outputConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param outputConfig The output configuration for storing sample data collected by the fleet. 
     */
    override fun outputConfig(outputConfig: CfnDeviceFleet.EdgeOutputConfigProperty) {
      cdkBuilder.outputConfig(outputConfig.let(CfnDeviceFleet.EdgeOutputConfigProperty.Companion::unwrap))
    }

    /**
     * @param outputConfig The output configuration for storing sample data collected by the fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("daffec862206a87e02d56b15c666c335c0e75534e9d3debb7dceabca1235918f")
    override
        fun outputConfig(outputConfig: CfnDeviceFleet.EdgeOutputConfigProperty.Builder.() -> Unit):
        Unit = outputConfig(CfnDeviceFleet.EdgeOutputConfigProperty(outputConfig))

    /**
     * @param roleArn The Amazon Resource Name (ARN) that has access to AWS Internet of Things
     * (IoT). 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags An array of key-value pairs that contain metadata to help you categorize and
     * organize your device fleets.
     * Each tag consists of a key and a value, both of which you define.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs that contain metadata to help you categorize and
     * organize your device fleets.
     * Each tag consists of a key and a value, both of which you define.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnDeviceFleetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sagemaker.CfnDeviceFleetProps,
  ) : CdkObject(cdkObject),
      CfnDeviceFleetProps {
    /**
     * A description of the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Name of the device fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-devicefleetname)
     */
    override fun deviceFleetName(): String = unwrap(this).getDeviceFleetName()

    /**
     * The output configuration for storing sample data collected by the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-outputconfig)
     */
    override fun outputConfig(): Any = unwrap(this).getOutputConfig()

    /**
     * The Amazon Resource Name (ARN) that has access to AWS Internet of Things (IoT).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * An array of key-value pairs that contain metadata to help you categorize and organize your
     * device fleets.
     *
     * Each tag consists of a key and a value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeviceFleetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDeviceFleetProps):
        CfnDeviceFleetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDeviceFleetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeviceFleetProps):
        software.amazon.awscdk.services.sagemaker.CfnDeviceFleetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnDeviceFleetProps
  }
}
