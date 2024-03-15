@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface ConnectionRule {
  public fun description(): String? = unwrap(this).getDescription()

  public fun fromPort(): Number

  public fun protocol(): String? = unwrap(this).getProtocol()

  public fun toPort(): Number? = unwrap(this).getToPort()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun fromPort(fromPort: Number)

    public fun protocol(protocol: String)

    public fun toPort(toPort: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.ConnectionRule.Builder =
        software.amazon.awscdk.services.ec2.ConnectionRule.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun fromPort(fromPort: Number) {
      cdkBuilder.fromPort(fromPort)
    }

    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    override fun toPort(toPort: Number) {
      cdkBuilder.toPort(toPort)
    }

    public fun build(): software.amazon.awscdk.services.ec2.ConnectionRule = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.ConnectionRule,
  ) : CdkObject(cdkObject), ConnectionRule {
    override fun description(): String? = unwrap(this).getDescription()

    override fun fromPort(): Number = unwrap(this).getFromPort()

    override fun protocol(): String? = unwrap(this).getProtocol()

    override fun toPort(): Number? = unwrap(this).getToPort()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ConnectionRule {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ConnectionRule): ConnectionRule
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConnectionRule): software.amazon.awscdk.services.ec2.ConnectionRule
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.ConnectionRule
  }
}
