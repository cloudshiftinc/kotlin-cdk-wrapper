package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Number
import kotlin.Unit

public interface AclIcmp {
  public fun code(): Number? = unwrap(this).getCode()

  public fun type(): Number? = unwrap(this).getType()

  public interface Builder {
    public fun code(code: Number)

    public fun type(type: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AclIcmp.Builder =
        software.amazon.awscdk.services.ec2.AclIcmp.builder()

    override fun code(code: Number) {
      cdkBuilder.code(code)
    }

    override fun type(type: Number) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.ec2.AclIcmp = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.AclIcmp,
  ) : AclIcmp {
    override fun code(): Number? = unwrap(this).getCode()

    override fun type(): Number? = unwrap(this).getType()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AclIcmp {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AclIcmp): AclIcmp =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AclIcmp): software.amazon.awscdk.services.ec2.AclIcmp = (wrapped as
        Wrapper).cdkObject
  }
}
