@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnCustomEntityTypeProps {
  public fun contextWords(): List<String> = unwrap(this).getContextWords() ?: emptyList()

  public fun name(): String? = unwrap(this).getName()

  public fun regexString(): String? = unwrap(this).getRegexString()

  public fun tags(): Any? = unwrap(this).getTags()

  @CdkDslMarker
  public interface Builder {
    public fun contextWords(contextWords: List<String>)

    public fun contextWords(vararg contextWords: String)

    public fun name(name: String)

    public fun regexString(regexString: String)

    public fun tags(tags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnCustomEntityTypeProps.Builder =
        software.amazon.awscdk.services.glue.CfnCustomEntityTypeProps.builder()

    override fun contextWords(contextWords: List<String>) {
      cdkBuilder.contextWords(contextWords)
    }

    override fun contextWords(vararg contextWords: String): Unit =
        contextWords(contextWords.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun regexString(regexString: String) {
      cdkBuilder.regexString(regexString)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnCustomEntityTypeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnCustomEntityTypeProps,
  ) : CdkObject(cdkObject), CfnCustomEntityTypeProps {
    override fun contextWords(): List<String> = unwrap(this).getContextWords() ?: emptyList()

    override fun name(): String? = unwrap(this).getName()

    override fun regexString(): String? = unwrap(this).getRegexString()

    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCustomEntityTypeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCustomEntityTypeProps):
        CfnCustomEntityTypeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCustomEntityTypeProps):
        software.amazon.awscdk.services.glue.CfnCustomEntityTypeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnCustomEntityTypeProps
  }
}
