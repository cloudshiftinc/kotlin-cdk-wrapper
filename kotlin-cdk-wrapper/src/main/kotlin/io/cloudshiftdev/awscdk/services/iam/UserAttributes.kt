@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface UserAttributes {
  public fun userArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun userArn(userArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.UserAttributes.Builder =
        software.amazon.awscdk.services.iam.UserAttributes.builder()

    override fun userArn(userArn: String) {
      cdkBuilder.userArn(userArn)
    }

    public fun build(): software.amazon.awscdk.services.iam.UserAttributes = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.UserAttributes,
  ) : CdkObject(cdkObject), UserAttributes {
    override fun userArn(): String = unwrap(this).getUserArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.UserAttributes): UserAttributes
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserAttributes): software.amazon.awscdk.services.iam.UserAttributes
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.UserAttributes
  }
}
