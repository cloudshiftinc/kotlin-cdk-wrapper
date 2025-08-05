@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * A schema registry for an event source.
 */
public interface ISchemaRegistry {
  /**
   * Returns the schema registry config of the event source.
   *
   * @param target 
   * @param targetHandler 
   */
  public fun bind(target: IEventSourceMapping, targetHandler: IFunction): KafkaSchemaRegistryConfig

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.ISchemaRegistry,
  ) : CdkObject(cdkObject),
      ISchemaRegistry {
    /**
     * Returns the schema registry config of the event source.
     *
     * @param target 
     * @param targetHandler 
     */
    override fun bind(target: IEventSourceMapping, targetHandler: IFunction):
        KafkaSchemaRegistryConfig =
        unwrap(this).bind(target.let(IEventSourceMapping.Companion::unwrap),
        targetHandler.let(IFunction.Companion::unwrap)).let(KafkaSchemaRegistryConfig::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.ISchemaRegistry):
        ISchemaRegistry = CdkObjectWrappers.wrap(cdkObject) as? ISchemaRegistry ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISchemaRegistry):
        software.amazon.awscdk.services.lambda.ISchemaRegistry = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.ISchemaRegistry
  }
}
