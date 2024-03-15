@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface RoleOptions {
  public fun assumeRoleArn(): String

  public fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

  @CdkDslMarker
  public interface Builder {
    public fun assumeRoleArn(assumeRoleArn: String)

    public fun assumeRoleExternalId(assumeRoleExternalId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.RoleOptions.Builder =
        software.amazon.awscdk.RoleOptions.builder()

    override fun assumeRoleArn(assumeRoleArn: String) {
      cdkBuilder.assumeRoleArn(assumeRoleArn)
    }

    override fun assumeRoleExternalId(assumeRoleExternalId: String) {
      cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
    }

    public fun build(): software.amazon.awscdk.RoleOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.RoleOptions,
  ) : CdkObject(cdkObject), RoleOptions {
    override fun assumeRoleArn(): String = unwrap(this).getAssumeRoleArn()

    override fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RoleOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.RoleOptions): RoleOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RoleOptions): software.amazon.awscdk.RoleOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.RoleOptions
  }
}
