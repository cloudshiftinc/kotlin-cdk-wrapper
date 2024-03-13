package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Number
import kotlin.Unit

public interface AclPortRange {
  public fun from(): Number? = unwrap(this).getFrom()

  public fun to(): Number? = unwrap(this).getTo()

  public interface Builder {
    public fun from(from: Number) {
    }

    public fun to(to: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AclPortRange.Builder =
        software.amazon.awscdk.services.ec2.AclPortRange.builder()

    public override fun from(from: Number) {
      cdkBuilder.from(from)
    }

    public override fun to(to: Number) {
      cdkBuilder.to(to)
    }

    public fun build(): software.amazon.awscdk.services.ec2.AclPortRange = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.AclPortRange,
  ) : AclPortRange {
    public override fun from(): Number? = unwrap(this).getFrom()

    public override fun to(): Number? = unwrap(this).getTo()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AclPortRange {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AclPortRange): AclPortRange =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AclPortRange): software.amazon.awscdk.services.ec2.AclPortRange =
        (wrapped as Wrapper).cdkObject
  }
}
