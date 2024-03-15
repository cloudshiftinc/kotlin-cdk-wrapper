@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnRegexPatternSetProps {
  public fun name(): String

  public fun regexPatternStrings(): List<String>

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun regexPatternStrings(regexPatternStrings: List<String>)

    public fun regexPatternStrings(vararg regexPatternStrings: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.waf.regional.CfnRegexPatternSetProps.Builder =
        software.amazon.awscdk.services.waf.regional.CfnRegexPatternSetProps.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun regexPatternStrings(regexPatternStrings: List<String>) {
      cdkBuilder.regexPatternStrings(regexPatternStrings)
    }

    override fun regexPatternStrings(vararg regexPatternStrings: String): Unit =
        regexPatternStrings(regexPatternStrings.toList())

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnRegexPatternSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.waf.regional.CfnRegexPatternSetProps,
  ) : CdkObject(cdkObject), CfnRegexPatternSetProps {
    override fun name(): String = unwrap(this).getName()

    override fun regexPatternStrings(): List<String> = unwrap(this).getRegexPatternStrings()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRegexPatternSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnRegexPatternSetProps):
        CfnRegexPatternSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRegexPatternSetProps):
        software.amazon.awscdk.services.waf.regional.CfnRegexPatternSetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.waf.regional.CfnRegexPatternSetProps
  }
}
