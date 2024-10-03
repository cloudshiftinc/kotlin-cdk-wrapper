@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotevents

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
 * Properties for defining a `CfnDetectorModel`.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html)
 */
public interface CfnDetectorModelProps {
  /**
   * Information that defines how a detector operates.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodeldefinition)
   */
  public fun detectorModelDefinition(): Any

  /**
   * A brief description of the detector model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodeldescription)
   */
  public fun detectorModelDescription(): String? = unwrap(this).getDetectorModelDescription()

  /**
   * The name of the detector model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodelname)
   */
  public fun detectorModelName(): String? = unwrap(this).getDetectorModelName()

  /**
   * Information about the order in which events are evaluated and how actions are executed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-evaluationmethod)
   */
  public fun evaluationMethod(): String? = unwrap(this).getEvaluationMethod()

  /**
   * The value used to identify a detector instance.
   *
   * When a device or system sends input, a new detector instance with a unique key value is
   * created. AWS IoT Events can continue to route input to its corresponding detector instance based
   * on this identifying information.
   *
   * This parameter uses a JSON-path expression to select the attribute-value pair in the message
   * payload that is used for identification. To route the message to the correct detector instance,
   * the device must send a message payload that contains the same attribute-value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-key)
   */
  public fun key(): String? = unwrap(this).getKey()

  /**
   * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-rolearn)
   */
  public fun roleArn(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDetectorModelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param detectorModelDefinition Information that defines how a detector operates. 
     */
    public fun detectorModelDefinition(detectorModelDefinition: IResolvable)

    /**
     * @param detectorModelDefinition Information that defines how a detector operates. 
     */
    public
        fun detectorModelDefinition(detectorModelDefinition: CfnDetectorModel.DetectorModelDefinitionProperty)

    /**
     * @param detectorModelDefinition Information that defines how a detector operates. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14304516dc6b8fc11c775d14439f15426e3de3adb330e3dde1412f6dbfe30b72")
    public
        fun detectorModelDefinition(detectorModelDefinition: CfnDetectorModel.DetectorModelDefinitionProperty.Builder.() -> Unit)

    /**
     * @param detectorModelDescription A brief description of the detector model.
     */
    public fun detectorModelDescription(detectorModelDescription: String)

    /**
     * @param detectorModelName The name of the detector model.
     */
    public fun detectorModelName(detectorModelName: String)

    /**
     * @param evaluationMethod Information about the order in which events are evaluated and how
     * actions are executed.
     */
    public fun evaluationMethod(evaluationMethod: String)

    /**
     * @param key The value used to identify a detector instance.
     * When a device or system sends input, a new detector instance with a unique key value is
     * created. AWS IoT Events can continue to route input to its corresponding detector instance based
     * on this identifying information.
     *
     * This parameter uses a JSON-path expression to select the attribute-value pair in the message
     * payload that is used for identification. To route the message to the correct detector instance,
     * the device must send a message payload that contains the same attribute-value.
     */
    public fun key(key: String)

    /**
     * @param roleArn The ARN of the role that grants permission to AWS IoT Events to perform its
     * operations. 
     */
    public fun roleArn(roleArn: String)

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
    private val cdkBuilder: software.amazon.awscdk.services.iotevents.CfnDetectorModelProps.Builder
        = software.amazon.awscdk.services.iotevents.CfnDetectorModelProps.builder()

    /**
     * @param detectorModelDefinition Information that defines how a detector operates. 
     */
    override fun detectorModelDefinition(detectorModelDefinition: IResolvable) {
      cdkBuilder.detectorModelDefinition(detectorModelDefinition.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param detectorModelDefinition Information that defines how a detector operates. 
     */
    override
        fun detectorModelDefinition(detectorModelDefinition: CfnDetectorModel.DetectorModelDefinitionProperty) {
      cdkBuilder.detectorModelDefinition(detectorModelDefinition.let(CfnDetectorModel.DetectorModelDefinitionProperty.Companion::unwrap))
    }

    /**
     * @param detectorModelDefinition Information that defines how a detector operates. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14304516dc6b8fc11c775d14439f15426e3de3adb330e3dde1412f6dbfe30b72")
    override
        fun detectorModelDefinition(detectorModelDefinition: CfnDetectorModel.DetectorModelDefinitionProperty.Builder.() -> Unit):
        Unit =
        detectorModelDefinition(CfnDetectorModel.DetectorModelDefinitionProperty(detectorModelDefinition))

    /**
     * @param detectorModelDescription A brief description of the detector model.
     */
    override fun detectorModelDescription(detectorModelDescription: String) {
      cdkBuilder.detectorModelDescription(detectorModelDescription)
    }

    /**
     * @param detectorModelName The name of the detector model.
     */
    override fun detectorModelName(detectorModelName: String) {
      cdkBuilder.detectorModelName(detectorModelName)
    }

    /**
     * @param evaluationMethod Information about the order in which events are evaluated and how
     * actions are executed.
     */
    override fun evaluationMethod(evaluationMethod: String) {
      cdkBuilder.evaluationMethod(evaluationMethod)
    }

    /**
     * @param key The value used to identify a detector instance.
     * When a device or system sends input, a new detector instance with a unique key value is
     * created. AWS IoT Events can continue to route input to its corresponding detector instance based
     * on this identifying information.
     *
     * This parameter uses a JSON-path expression to select the attribute-value pair in the message
     * payload that is used for identification. To route the message to the correct detector instance,
     * the device must send a message payload that contains the same attribute-value.
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * @param roleArn The ARN of the role that grants permission to AWS IoT Events to perform its
     * operations. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
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

    public fun build(): software.amazon.awscdk.services.iotevents.CfnDetectorModelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModelProps,
  ) : CdkObject(cdkObject),
      CfnDetectorModelProps {
    /**
     * Information that defines how a detector operates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodeldefinition)
     */
    override fun detectorModelDefinition(): Any = unwrap(this).getDetectorModelDefinition()

    /**
     * A brief description of the detector model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodeldescription)
     */
    override fun detectorModelDescription(): String? = unwrap(this).getDetectorModelDescription()

    /**
     * The name of the detector model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodelname)
     */
    override fun detectorModelName(): String? = unwrap(this).getDetectorModelName()

    /**
     * Information about the order in which events are evaluated and how actions are executed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-evaluationmethod)
     */
    override fun evaluationMethod(): String? = unwrap(this).getEvaluationMethod()

    /**
     * The value used to identify a detector instance.
     *
     * When a device or system sends input, a new detector instance with a unique key value is
     * created. AWS IoT Events can continue to route input to its corresponding detector instance based
     * on this identifying information.
     *
     * This parameter uses a JSON-path expression to select the attribute-value pair in the message
     * payload that is used for identification. To route the message to the correct detector instance,
     * the device must send a message payload that contains the same attribute-value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-key)
     */
    override fun key(): String? = unwrap(this).getKey()

    /**
     * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDetectorModelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnDetectorModelProps):
        CfnDetectorModelProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDetectorModelProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDetectorModelProps):
        software.amazon.awscdk.services.iotevents.CfnDetectorModelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotevents.CfnDetectorModelProps
  }
}
