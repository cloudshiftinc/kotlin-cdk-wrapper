package io.cloudshiftdev.awscdk.services.iam

public interface IGrantable {
  public fun grantPrincipal(): IPrincipal

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.iam.IGrantable,
  ) : IGrantable {
    override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IGrantable): IGrantable =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IGrantable): software.amazon.awscdk.services.iam.IGrantable =
        (wrapped as Wrapper).cdkObject
  }
}
