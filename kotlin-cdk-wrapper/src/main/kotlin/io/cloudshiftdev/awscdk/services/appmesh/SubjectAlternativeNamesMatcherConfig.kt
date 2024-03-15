@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface SubjectAlternativeNamesMatcherConfig {
  public fun subjectAlternativeNamesMatch(): CfnVirtualNode.SubjectAlternativeNameMatchersProperty

  @CdkDslMarker
  public interface Builder {
    public
        fun subjectAlternativeNamesMatch(subjectAlternativeNamesMatch: CfnVirtualNode.SubjectAlternativeNameMatchersProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef79e7626fd70c1ee5ab7487235d5b5dfd0a789a9ce0b16d39c3bb164a47bef4")
    public
        fun subjectAlternativeNamesMatch(subjectAlternativeNamesMatch: CfnVirtualNode.SubjectAlternativeNameMatchersProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.SubjectAlternativeNamesMatcherConfig.Builder =
        software.amazon.awscdk.services.appmesh.SubjectAlternativeNamesMatcherConfig.builder()

    override
        fun subjectAlternativeNamesMatch(subjectAlternativeNamesMatch: CfnVirtualNode.SubjectAlternativeNameMatchersProperty) {
      cdkBuilder.subjectAlternativeNamesMatch(subjectAlternativeNamesMatch.let(CfnVirtualNode.SubjectAlternativeNameMatchersProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef79e7626fd70c1ee5ab7487235d5b5dfd0a789a9ce0b16d39c3bb164a47bef4")
    override
        fun subjectAlternativeNamesMatch(subjectAlternativeNamesMatch: CfnVirtualNode.SubjectAlternativeNameMatchersProperty.Builder.() -> Unit):
        Unit =
        subjectAlternativeNamesMatch(CfnVirtualNode.SubjectAlternativeNameMatchersProperty(subjectAlternativeNamesMatch))

    public fun build(): software.amazon.awscdk.services.appmesh.SubjectAlternativeNamesMatcherConfig
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.appmesh.SubjectAlternativeNamesMatcherConfig,
  ) : CdkObject(cdkObject), SubjectAlternativeNamesMatcherConfig {
    override fun subjectAlternativeNamesMatch():
        CfnVirtualNode.SubjectAlternativeNameMatchersProperty =
        unwrap(this).getSubjectAlternativeNamesMatch().let(CfnVirtualNode.SubjectAlternativeNameMatchersProperty::wrap)
  }

  public companion object {
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
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appmesh.SubjectAlternativeNamesMatcherConfig
  }
}
