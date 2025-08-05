@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * The key-value pair that identifies the underlying processor resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
 * DataProcessorIdentifier dataProcessorIdentifier = DataProcessorIdentifier.builder()
 * .parameterName("parameterName")
 * .parameterValue("parameterValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html)
 */
public interface DataProcessorIdentifier {
  /**
   * The parameter name that corresponds to the processor resource's identifier.
   *
   * Must be an accepted value in `CfnDeliveryStream.ProcessoryParameterProperty.ParameterName`.
   */
  public fun parameterName(): String

  /**
   * The identifier of the underlying processor resource.
   */
  public fun parameterValue(): String

  /**
   * A builder for [DataProcessorIdentifier]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param parameterName The parameter name that corresponds to the processor resource's
     * identifier. 
     * Must be an accepted value in `CfnDeliveryStream.ProcessoryParameterProperty.ParameterName`.
     */
    public fun parameterName(parameterName: String)

    /**
     * @param parameterValue The identifier of the underlying processor resource. 
     */
    public fun parameterValue(parameterValue: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisfirehose.DataProcessorIdentifier.Builder =
        software.amazon.awscdk.services.kinesisfirehose.DataProcessorIdentifier.builder()

    /**
     * @param parameterName The parameter name that corresponds to the processor resource's
     * identifier. 
     * Must be an accepted value in `CfnDeliveryStream.ProcessoryParameterProperty.ParameterName`.
     */
    override fun parameterName(parameterName: String) {
      cdkBuilder.parameterName(parameterName)
    }

    /**
     * @param parameterValue The identifier of the underlying processor resource. 
     */
    override fun parameterValue(parameterValue: String) {
      cdkBuilder.parameterValue(parameterValue)
    }

    public fun build(): software.amazon.awscdk.services.kinesisfirehose.DataProcessorIdentifier =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesisfirehose.DataProcessorIdentifier,
  ) : CdkObject(cdkObject),
      DataProcessorIdentifier {
    /**
     * The parameter name that corresponds to the processor resource's identifier.
     *
     * Must be an accepted value in `CfnDeliveryStream.ProcessoryParameterProperty.ParameterName`.
     */
    override fun parameterName(): String = unwrap(this).getParameterName()

    /**
     * The identifier of the underlying processor resource.
     */
    override fun parameterValue(): String = unwrap(this).getParameterValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DataProcessorIdentifier {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.DataProcessorIdentifier):
        DataProcessorIdentifier = CdkObjectWrappers.wrap(cdkObject) as? DataProcessorIdentifier ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DataProcessorIdentifier):
        software.amazon.awscdk.services.kinesisfirehose.DataProcessorIdentifier = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.kinesisfirehose.DataProcessorIdentifier
  }
}
