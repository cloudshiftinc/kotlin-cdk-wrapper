package io.cloudshiftdev.awscdk

import io.cloudshiftdev.constructs.IConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface IResolveContext {
  public fun documentPath(): List<String>

  public fun preparing(): Boolean

  public fun registerPostProcessor(arg0: IPostProcessor)

  public fun resolve(arg0: Any): Any

  public fun resolve(arg0: Any, arg1: ResolveChangeContextOptions): Any

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("db6f0e945d885bf6bbf91c126c04d7917a4c9e7c10e9a8c19706a073cbe95ff3")
  public fun resolve(arg0: Any, arg1: ResolveChangeContextOptions.Builder.() -> Unit): Any

  public fun scope(): IConstruct

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.IResolveContext,
  ) : IResolveContext {
    override fun documentPath(): List<String> = unwrap(this).getDocumentPath()

    override fun preparing(): Boolean = unwrap(this).getPreparing()

    override fun registerPostProcessor(arg0: IPostProcessor) {
      unwrap(this).registerPostProcessor(arg0.let(IPostProcessor::unwrap))
    }

    override fun resolve(arg0: Any): Any = unwrap(this).resolve(arg0)

    override fun resolve(arg0: Any, arg1: ResolveChangeContextOptions): Any =
        unwrap(this).resolve(arg0, arg1.let(ResolveChangeContextOptions::unwrap))

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db6f0e945d885bf6bbf91c126c04d7917a4c9e7c10e9a8c19706a073cbe95ff3")
    override fun resolve(arg0: Any, arg1: ResolveChangeContextOptions.Builder.() -> Unit): Any =
        resolve(arg0, ResolveChangeContextOptions(arg1))

    override fun scope(): IConstruct = unwrap(this).getScope().let(IConstruct::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.IResolveContext): IResolveContext =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IResolveContext): software.amazon.awscdk.IResolveContext = (wrapped
        as Wrapper).cdkObject
  }
}
