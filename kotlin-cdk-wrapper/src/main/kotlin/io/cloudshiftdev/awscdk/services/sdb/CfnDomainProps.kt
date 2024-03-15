@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sdb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnDomainProps {
  public fun description(): String? = unwrap(this).getDescription()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sdb.CfnDomainProps.Builder =
        software.amazon.awscdk.services.sdb.CfnDomainProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public fun build(): software.amazon.awscdk.services.sdb.CfnDomainProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sdb.CfnDomainProps,
  ) : CdkObject(cdkObject), CfnDomainProps {
    override fun description(): String? = unwrap(this).getDescription()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sdb.CfnDomainProps): CfnDomainProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDomainProps): software.amazon.awscdk.services.sdb.CfnDomainProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sdb.CfnDomainProps
  }
}
