package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface LaunchTemplateSpec {
  /**
   * The Launch template ID.
   */
  public fun id(): String

  /**
   * The launch template version to be used (optional).
   *
   * Default: - the default version of the launch template
   */
  public fun version(): String? = unwrap(this).getVersion()

  /**
   * A builder for [LaunchTemplateSpec]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param id The Launch template ID. 
     */
    public fun id(id: String)

    /**
     * @param version The launch template version to be used (optional).
     */
    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.LaunchTemplateSpec.Builder =
        software.amazon.awscdk.services.eks.LaunchTemplateSpec.builder()

    /**
     * @param id The Launch template ID. 
     */
    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    /**
     * @param version The launch template version to be used (optional).
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.eks.LaunchTemplateSpec = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.LaunchTemplateSpec,
  ) : CdkObject(cdkObject), LaunchTemplateSpec {
    /**
     * The Launch template ID.
     */
    override fun id(): String = unwrap(this).getId()

    /**
     * The launch template version to be used (optional).
     *
     * Default: - the default version of the launch template
     */
    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LaunchTemplateSpec {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.LaunchTemplateSpec):
        LaunchTemplateSpec = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LaunchTemplateSpec):
        software.amazon.awscdk.services.eks.LaunchTemplateSpec = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.eks.LaunchTemplateSpec
  }
}
