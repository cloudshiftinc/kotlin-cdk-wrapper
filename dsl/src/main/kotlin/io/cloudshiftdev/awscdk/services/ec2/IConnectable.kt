package io.cloudshiftdev.awscdk.services.ec2

public interface IConnectable {
  public fun connections(): Connections

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.IConnectable,
  ) : IConnectable {
    public override fun connections(): Connections =
        unwrap(this).getConnections().let(Connections::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IConnectable): IConnectable =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IConnectable): software.amazon.awscdk.services.ec2.IConnectable =
        (wrapped as Wrapper).cdkObject
  }
}
