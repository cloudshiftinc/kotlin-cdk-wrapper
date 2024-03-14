package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface SubjectAlternativeNamesMatcherConfig {
  /**
   * VirtualNode CFN configuration for subject alternative names secured by the certificate.
   */
  public fun subjectAlternativeNamesMatch(): CfnVirtualNode.SubjectAlternativeNameMatchersProperty

  /**
   * A builder for [SubjectAlternativeNamesMatcherConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param subjectAlternativeNamesMatch VirtualNode CFN configuration for subject alternative
     * names secured by the certificate. 
     */
    public
        fun subjectAlternativeNamesMatch(subjectAlternativeNamesMatch: CfnVirtualNode.SubjectAlternativeNameMatchersProperty)

    /**
     * @param subjectAlternativeNamesMatch VirtualNode CFN configuration for subject alternative
     * names secured by the certificate. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef79e7626fd70c1ee5ab7487235d5b5dfd0a789a9ce0b16d39c3bb164a47bef4")
    public
        fun subjectAlternativeNamesMatch(subjectAlternativeNamesMatch: CfnVirtualNode.SubjectAlternativeNameMatchersProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.SubjectAlternativeNamesMatcherConfig.Builder =
        software.amazon.awscdk.services.appmesh.SubjectAlternativeNamesMatcherConfig.builder()

    /**
     * @param subjectAlternativeNamesMatch VirtualNode CFN configuration for subject alternative
     * names secured by the certificate. 
     */
    override
        fun subjectAlternativeNamesMatch(subjectAlternativeNamesMatch: CfnVirtualNode.SubjectAlternativeNameMatchersProperty) {
      cdkBuilder.subjectAlternativeNamesMatch(subjectAlternativeNamesMatch.let(CfnVirtualNode.SubjectAlternativeNameMatchersProperty::unwrap))
    }

    /**
     * @param subjectAlternativeNamesMatch VirtualNode CFN configuration for subject alternative
     * names secured by the certificate. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef79e7626fd70c1ee5ab7487235d5b5dfd0a789a9ce0b16d39c3bb164a47bef4")
    override
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
    /**
     * VirtualNode CFN configuration for subject alternative names secured by the certificate.
     */
    override fun subjectAlternativeNamesMatch():
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
