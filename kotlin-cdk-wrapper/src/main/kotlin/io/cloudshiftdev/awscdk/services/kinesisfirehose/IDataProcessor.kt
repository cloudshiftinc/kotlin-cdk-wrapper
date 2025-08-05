@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A data processor that Amazon Data Firehose will call to transform records before delivering data.
 */
public interface IDataProcessor {
  /**
   * Binds this processor to a destination of a delivery stream.
   *
   * Implementers should use this method to grant processor invocation permissions to the provided
   * stream and return the
   * necessary configuration to register as a processor.
   *
   * @param scope 
   * @param options 
   */
  public fun bind(scope: Construct, options: DataProcessorBindOptions): DataProcessorConfig

  /**
   * Binds this processor to a destination of a delivery stream.
   *
   * Implementers should use this method to grant processor invocation permissions to the provided
   * stream and return the
   * necessary configuration to register as a processor.
   *
   * @param scope 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ddee5c54a61fd62f1739692d90a65cc63b37887a677215acfca7573c35cecb08")
  public fun bind(scope: Construct, options: DataProcessorBindOptions.Builder.() -> Unit):
      DataProcessorConfig

  /**
   * The constructor props of the DataProcessor.
   */
  public fun props(): DataProcessorProps

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesisfirehose.IDataProcessor,
  ) : CdkObject(cdkObject),
      IDataProcessor {
    /**
     * Binds this processor to a destination of a delivery stream.
     *
     * Implementers should use this method to grant processor invocation permissions to the provided
     * stream and return the
     * necessary configuration to register as a processor.
     *
     * @param scope 
     * @param options 
     */
    override fun bind(scope: Construct, options: DataProcessorBindOptions): DataProcessorConfig =
        unwrap(this).bind(scope.let(Construct.Companion::unwrap),
        options.let(DataProcessorBindOptions.Companion::unwrap)).let(DataProcessorConfig::wrap)

    /**
     * Binds this processor to a destination of a delivery stream.
     *
     * Implementers should use this method to grant processor invocation permissions to the provided
     * stream and return the
     * necessary configuration to register as a processor.
     *
     * @param scope 
     * @param options 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ddee5c54a61fd62f1739692d90a65cc63b37887a677215acfca7573c35cecb08")
    override fun bind(scope: Construct, options: DataProcessorBindOptions.Builder.() -> Unit):
        DataProcessorConfig = bind(scope, DataProcessorBindOptions(options))

    /**
     * The constructor props of the DataProcessor.
     */
    override fun props(): DataProcessorProps = unwrap(this).getProps().let(DataProcessorProps::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.IDataProcessor):
        IDataProcessor = CdkObjectWrappers.wrap(cdkObject) as? IDataProcessor ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDataProcessor):
        software.amazon.awscdk.services.kinesisfirehose.IDataProcessor = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.kinesisfirehose.IDataProcessor
  }
}
