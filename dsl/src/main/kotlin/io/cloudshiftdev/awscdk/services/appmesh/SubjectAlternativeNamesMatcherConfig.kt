package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface SubjectAlternativeNamesMatcherConfig {
  public fun subjectAlternativeNamesMatch(): CfnVirtualNode.SubjectAlternativeNameMatchersProperty

  public interface Builder {
    public
        fun subjectAlternativeNamesMatch(subjectAlternativeNamesMatch: CfnVirtualNode.SubjectAlternativeNameMatchersProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef79e7626fd70c1ee5ab7487235d5b5dfd0a789a9ce0b16d39c3bb164a47bef4")
    public
        fun subjectAlternativeNamesMatch(subjectAlternativeNamesMatch: CfnVirtualNode.SubjectAlternativeNameMatchersProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.SubjectAlternativeNamesMatcherConfig.Builder =
        software.amazon.awscdk.services.appmesh.SubjectAlternativeNamesMatcherConfig.builder()

    public override
        fun subjectAlternativeNamesMatch(subjectAlternativeNamesMatch: CfnVirtualNode.SubjectAlternativeNameMatchersProperty) {
      cdkBuilder.subjectAlternativeNamesMatch(subjectAlternativeNamesMatch.let(CfnVirtualNode.SubjectAlternativeNameMatchersProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef79e7626fd70c1ee5ab7487235d5b5dfd0a789a9ce0b16d39c3bb164a47bef4")
    public override
        fun subjectAlternativeNamesMatch(subjectAlternativeNamesMatch: CfnVirtualNode.SubjectAlternativeNameMatchersProperty.Builder.() -> Unit):
        Unit =
        subjectAlternativeNamesMatch(CfnVirtualNode.SubjectAlternativeNameMatchersProperty(subjectAlternativeNamesMatch))

    public fun build(): software.amazon.awscdk.services.appmesh.SubjectAlternativeNamesMatcherConfig
        = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.appmesh.SubjectAlternativeNamesMatcherConfig,
  ) : SubjectAlternativeNamesMatcherConfig {
    public override fun subjectAlternativeNamesMatch():
        CfnVirtualNode.SubjectAlternativeNameMatchersProperty =
        unwrap(this).getSubjectAlternativeNamesMatch().let(CfnVirtualNode.SubjectAlternativeNameMatchersProperty::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}):
        SubjectAlternativeNamesMatcherConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.SubjectAlternativeNamesMatcherConfig):
        SubjectAlternativeNamesMatcherConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SubjectAlternativeNamesMatcherConfig):
        software.amazon.awscdk.services.appmesh.SubjectAlternativeNamesMatcherConfig = (wrapped as
        Wrapper).cdkObject
  }
}
