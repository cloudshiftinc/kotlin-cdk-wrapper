package io.cloudshiftdev.awscdk

import io.cloudshiftdev.constructs.Construct
import kotlin.Any
import kotlin.String

public abstract class CustomResourceProviderBase internal constructor(
  private val cdkObject: software.amazon.awscdk.CustomResourceProviderBase,
) : Construct(cdkObject) {
  public open fun addToRolePolicy(statement: Any) {
    unwrap(this).addToRolePolicy(statement)
  }

  public open fun codeHash(): String = unwrap(this).getCodeHash()

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun serviceToken(): String = unwrap(this).getServiceToken()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.CustomResourceProviderBase,
  ) : CustomResourceProviderBase(cdkObject)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CustomResourceProviderBase):
        CustomResourceProviderBase = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomResourceProviderBase):
        software.amazon.awscdk.CustomResourceProviderBase = (wrapped as Wrapper).cdkObject
  }
}
