package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface LayerVersionAttributes {
  /**
   * The list of compatible runtimes with this Layer.
   */
  public fun compatibleRuntimes(): List<Runtime> =
      unwrap(this).getCompatibleRuntimes()?.map(Runtime::wrap) ?: emptyList()

  /**
   * The ARN of the LayerVersion.
   */
  public fun layerVersionArn(): String

  /**
   * A builder for [LayerVersionAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param compatibleRuntimes The list of compatible runtimes with this Layer.
     */
    public fun compatibleRuntimes(compatibleRuntimes: List<Runtime>)

    /**
     * @param compatibleRuntimes The list of compatible runtimes with this Layer.
     */
    public fun compatibleRuntimes(vararg compatibleRuntimes: Runtime)

    /**
     * @param layerVersionArn The ARN of the LayerVersion. 
     */
    public fun layerVersionArn(layerVersionArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.LayerVersionAttributes.Builder =
        software.amazon.awscdk.services.lambda.LayerVersionAttributes.builder()

    /**
     * @param compatibleRuntimes The list of compatible runtimes with this Layer.
     */
    override fun compatibleRuntimes(compatibleRuntimes: List<Runtime>) {
      cdkBuilder.compatibleRuntimes(compatibleRuntimes.map(Runtime::unwrap))
    }

    /**
     * @param compatibleRuntimes The list of compatible runtimes with this Layer.
     */
    override fun compatibleRuntimes(vararg compatibleRuntimes: Runtime): Unit =
        compatibleRuntimes(compatibleRuntimes.toList())

    /**
     * @param layerVersionArn The ARN of the LayerVersion. 
     */
    override fun layerVersionArn(layerVersionArn: String) {
      cdkBuilder.layerVersionArn(layerVersionArn)
    }

    public fun build(): software.amazon.awscdk.services.lambda.LayerVersionAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.LayerVersionAttributes,
  ) : CdkObject(cdkObject), LayerVersionAttributes {
    /**
     * The list of compatible runtimes with this Layer.
     */
    override fun compatibleRuntimes(): List<Runtime> =
        unwrap(this).getCompatibleRuntimes()?.map(Runtime::wrap) ?: emptyList()

    /**
     * The ARN of the LayerVersion.
     */
    override fun layerVersionArn(): String = unwrap(this).getLayerVersionArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LayerVersionAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.LayerVersionAttributes):
        LayerVersionAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LayerVersionAttributes):
        software.amazon.awscdk.services.lambda.LayerVersionAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.LayerVersionAttributes
  }
}