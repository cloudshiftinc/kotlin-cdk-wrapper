@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Interface for Stack Synthesizers that can be used for more than one stack.
 *
 * Regular `IStackSynthesizer` instances can only be bound to a Stack once.
 * `IReusableStackSynthesizer` instances.
 *
 * For backwards compatibility reasons, this class inherits from
 * `IStackSynthesizer`, but if an object implements `IReusableStackSynthesizer`,
 * no other methods than `reusableBind()` will be called.
 */
public interface IReusableStackSynthesizer : IStackSynthesizer {
  /**
   * Produce a bound Stack Synthesizer for the given stack.
   *
   * This method may be called more than once on the same object.
   *
   * @param stack 
   */
  public fun reusableBind(stack: Stack): IBoundStackSynthesizer

  private class Wrapper(
    cdkObject: software.amazon.awscdk.IReusableStackSynthesizer,
  ) : CdkObject(cdkObject),
      IReusableStackSynthesizer {
    /**
     * Register a Docker Image Asset.
     *
     * Returns the parameters that can be used to refer to the asset inside the template.
     *
     * @param asset 
     */
    override fun addDockerImageAsset(asset: DockerImageAssetSource): DockerImageAssetLocation =
        unwrap(this).addDockerImageAsset(asset.let(DockerImageAssetSource.Companion::unwrap)).let(DockerImageAssetLocation::wrap)

    /**
     * Register a Docker Image Asset.
     *
     * Returns the parameters that can be used to refer to the asset inside the template.
     *
     * @param asset 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60e85405255a4559d9d101644bfe36735011455aae5a7b2c0ff140d999863ded")
    override fun addDockerImageAsset(asset: DockerImageAssetSource.Builder.() -> Unit):
        DockerImageAssetLocation = addDockerImageAsset(DockerImageAssetSource(asset))

    /**
     * Register a File Asset.
     *
     * Returns the parameters that can be used to refer to the asset inside the template.
     *
     * @param asset 
     */
    override fun addFileAsset(asset: FileAssetSource): FileAssetLocation =
        unwrap(this).addFileAsset(asset.let(FileAssetSource.Companion::unwrap)).let(FileAssetLocation::wrap)

    /**
     * Register a File Asset.
     *
     * Returns the parameters that can be used to refer to the asset inside the template.
     *
     * @param asset 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b8c4a8252dd3ca6f0e54c1277f4347dc34084a3d362bd2ed69cb738a218590d6")
    override fun addFileAsset(asset: FileAssetSource.Builder.() -> Unit): FileAssetLocation =
        addFileAsset(FileAssetSource(asset))

    /**
     * Bind to the stack this environment is going to be used on.
     *
     * Must be called before any of the other methods are called, and can only be called once.
     *
     * @param stack 
     */
    override fun bind(stack: Stack) {
      unwrap(this).bind(stack.let(Stack.Companion::unwrap))
    }

    /**
     * The qualifier used to bootstrap this stack.
     *
     * Default: - no qualifier
     */
    override fun bootstrapQualifier(): String? = unwrap(this).getBootstrapQualifier()

    /**
     * The role used to lookup for this stack.
     *
     * Default: - no role
     */
    override fun lookupRole(): String? = unwrap(this).getLookupRole()

    /**
     * Produce a bound Stack Synthesizer for the given stack.
     *
     * This method may be called more than once on the same object.
     *
     * @param stack 
     */
    override fun reusableBind(stack: Stack): IBoundStackSynthesizer =
        unwrap(this).reusableBind(stack.let(Stack.Companion::unwrap)).let(IBoundStackSynthesizer::wrap)

    /**
     * Synthesize the associated stack to the session.
     *
     * @param session 
     */
    override fun synthesize(session: ISynthesisSession) {
      unwrap(this).synthesize(session.let(ISynthesisSession.Companion::unwrap))
    }
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IReusableStackSynthesizer):
        IReusableStackSynthesizer = CdkObjectWrappers.wrap(cdkObject) as? IReusableStackSynthesizer
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IReusableStackSynthesizer):
        software.amazon.awscdk.IReusableStackSynthesizer = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.IReusableStackSynthesizer
  }
}
