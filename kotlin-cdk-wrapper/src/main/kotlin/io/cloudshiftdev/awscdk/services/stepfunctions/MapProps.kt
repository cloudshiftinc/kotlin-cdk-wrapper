@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface MapProps : MapBaseProps {
  @Deprecated(message = "deprecated in CDK")
  public fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)

    public fun inputPath(inputPath: String)

    public fun itemSelector(itemSelector: Map<String, Any>)

    public fun itemsPath(itemsPath: String)

    public fun maxConcurrency(maxConcurrency: Number)

    public fun maxConcurrencyPath(maxConcurrencyPath: String)

    public fun outputPath(outputPath: String)

    @Deprecated(message = "deprecated in CDK")
    public fun parameters(parameters: Map<String, Any>)

    public fun resultPath(resultPath: String)

    public fun resultSelector(resultSelector: Map<String, Any>)

    public fun stateName(stateName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.MapProps.Builder =
        software.amazon.awscdk.services.stepfunctions.MapProps.builder()

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    override fun itemSelector(itemSelector: Map<String, Any>) {
      cdkBuilder.itemSelector(itemSelector)
    }

    override fun itemsPath(itemsPath: String) {
      cdkBuilder.itemsPath(itemsPath)
    }

    override fun maxConcurrency(maxConcurrency: Number) {
      cdkBuilder.maxConcurrency(maxConcurrency)
    }

    override fun maxConcurrencyPath(maxConcurrencyPath: String) {
      cdkBuilder.maxConcurrencyPath(maxConcurrencyPath)
    }

    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters)
    }

    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector)
    }

    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.MapProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.MapProps,
  ) : CdkObject(cdkObject), MapProps {
    override fun comment(): String? = unwrap(this).getComment()

    override fun inputPath(): String? = unwrap(this).getInputPath()

    override fun itemSelector(): Map<String, Any> = unwrap(this).getItemSelector() ?: emptyMap()

    override fun itemsPath(): String? = unwrap(this).getItemsPath()

    override fun maxConcurrency(): Number? = unwrap(this).getMaxConcurrency()

    override fun maxConcurrencyPath(): String? = unwrap(this).getMaxConcurrencyPath()

    override fun outputPath(): String? = unwrap(this).getOutputPath()

    @Deprecated(message = "deprecated in CDK")
    override fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

    override fun resultPath(): String? = unwrap(this).getResultPath()

    override fun resultSelector(): Map<String, Any> = unwrap(this).getResultSelector() ?: emptyMap()

    override fun stateName(): String? = unwrap(this).getStateName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MapProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.MapProps): MapProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: MapProps): software.amazon.awscdk.services.stepfunctions.MapProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.MapProps
  }
}
