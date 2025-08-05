@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The full configuration of a data processor.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
 * DataProcessorConfig dataProcessorConfig = DataProcessorConfig.builder()
 * .processorIdentifier(DataProcessorIdentifier.builder()
 * .parameterName("parameterName")
 * .parameterValue("parameterValue")
 * .build())
 * .processorType("processorType")
 * .build();
 * ```
 */
public interface DataProcessorConfig {
  /**
   * The key-value pair that identifies the underlying processor resource.
   */
  public fun processorIdentifier(): DataProcessorIdentifier

  /**
   * The type of the underlying processor resource.
   *
   * Must be an accepted value in `CfnDeliveryStream.ProcessorProperty.Type`.
   *
   * Example:
   *
   * ```
   * "Lambda";
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html#cfn-kinesisfirehose-deliverystream-processor-type)
   */
  public fun processorType(): String

  /**
   * A builder for [DataProcessorConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param processorIdentifier The key-value pair that identifies the underlying processor
     * resource. 
     */
    public fun processorIdentifier(processorIdentifier: DataProcessorIdentifier)

    /**
     * @param processorIdentifier The key-value pair that identifies the underlying processor
     * resource. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f8979a7ed6761045522b9fd82c4cda64f5c6803b417a4d992fcc3d2120f7ace")
    public fun processorIdentifier(processorIdentifier: DataProcessorIdentifier.Builder.() -> Unit)

    /**
     * @param processorType The type of the underlying processor resource. 
     * Must be an accepted value in `CfnDeliveryStream.ProcessorProperty.Type`.
     */
    public fun processorType(processorType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisfirehose.DataProcessorConfig.Builder =
        software.amazon.awscdk.services.kinesisfirehose.DataProcessorConfig.builder()

    /**
     * @param processorIdentifier The key-value pair that identifies the underlying processor
     * resource. 
     */
    override fun processorIdentifier(processorIdentifier: DataProcessorIdentifier) {
      cdkBuilder.processorIdentifier(processorIdentifier.let(DataProcessorIdentifier.Companion::unwrap))
    }

    /**
     * @param processorIdentifier The key-value pair that identifies the underlying processor
     * resource. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f8979a7ed6761045522b9fd82c4cda64f5c6803b417a4d992fcc3d2120f7ace")
    override
        fun processorIdentifier(processorIdentifier: DataProcessorIdentifier.Builder.() -> Unit):
        Unit = processorIdentifier(DataProcessorIdentifier(processorIdentifier))

    /**
     * @param processorType The type of the underlying processor resource. 
     * Must be an accepted value in `CfnDeliveryStream.ProcessorProperty.Type`.
     */
    override fun processorType(processorType: String) {
      cdkBuilder.processorType(processorType)
    }

    public fun build(): software.amazon.awscdk.services.kinesisfirehose.DataProcessorConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesisfirehose.DataProcessorConfig,
  ) : CdkObject(cdkObject),
      DataProcessorConfig {
    /**
     * The key-value pair that identifies the underlying processor resource.
     */
    override fun processorIdentifier(): DataProcessorIdentifier =
        unwrap(this).getProcessorIdentifier().let(DataProcessorIdentifier::wrap)

    /**
     * The type of the underlying processor resource.
     *
     * Must be an accepted value in `CfnDeliveryStream.ProcessorProperty.Type`.
     *
     * Example:
     *
     * ```
     * "Lambda";
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html#cfn-kinesisfirehose-deliverystream-processor-type)
     */
    override fun processorType(): String = unwrap(this).getProcessorType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DataProcessorConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.DataProcessorConfig):
        DataProcessorConfig = CdkObjectWrappers.wrap(cdkObject) as? DataProcessorConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DataProcessorConfig):
        software.amazon.awscdk.services.kinesisfirehose.DataProcessorConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.kinesisfirehose.DataProcessorConfig
  }
}
