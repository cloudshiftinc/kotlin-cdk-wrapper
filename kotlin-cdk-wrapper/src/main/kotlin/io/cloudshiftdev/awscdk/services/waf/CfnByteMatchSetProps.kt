@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnByteMatchSetProps {
  public fun byteMatchTuples(): Any? = unwrap(this).getByteMatchTuples()

  public fun name(): String

  @CdkDslMarker
  public interface Builder {
    public fun byteMatchTuples(byteMatchTuples: IResolvable)

    public fun byteMatchTuples(byteMatchTuples: List<Any>)

    public fun byteMatchTuples(vararg byteMatchTuples: Any)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.CfnByteMatchSetProps.Builder =
        software.amazon.awscdk.services.waf.CfnByteMatchSetProps.builder()

    override fun byteMatchTuples(byteMatchTuples: IResolvable) {
      cdkBuilder.byteMatchTuples(byteMatchTuples.let(IResolvable::unwrap))
    }

    override fun byteMatchTuples(byteMatchTuples: List<Any>) {
      cdkBuilder.byteMatchTuples(byteMatchTuples)
    }

    override fun byteMatchTuples(vararg byteMatchTuples: Any): Unit =
        byteMatchTuples(byteMatchTuples.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.waf.CfnByteMatchSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.waf.CfnByteMatchSetProps,
  ) : CdkObject(cdkObject), CfnByteMatchSetProps {
    override fun byteMatchTuples(): Any? = unwrap(this).getByteMatchTuples()

    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnByteMatchSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnByteMatchSetProps):
        CfnByteMatchSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnByteMatchSetProps):
        software.amazon.awscdk.services.waf.CfnByteMatchSetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.waf.CfnByteMatchSetProps
  }
}
