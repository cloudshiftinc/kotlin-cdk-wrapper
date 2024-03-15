@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticsearch

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit

public interface AdvancedSecurityOptions {
  @Deprecated(message = "deprecated in CDK")
  public fun masterUserArn(): String? = unwrap(this).getMasterUserArn()

  @Deprecated(message = "deprecated in CDK")
  public fun masterUserName(): String? = unwrap(this).getMasterUserName()

  @Deprecated(message = "deprecated in CDK")
  public fun masterUserPassword(): SecretValue? =
      unwrap(this).getMasterUserPassword()?.let(SecretValue::wrap)

  @CdkDslMarker
  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    @Deprecated(message = "deprecated in CDK")
    public fun masterUserArn(masterUserArn: String)

    @Deprecated(message = "deprecated in CDK")
    public fun masterUserName(masterUserName: String)

    @Deprecated(message = "deprecated in CDK")
    public fun masterUserPassword(masterUserPassword: SecretValue)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticsearch.AdvancedSecurityOptions.Builder =
        software.amazon.awscdk.services.elasticsearch.AdvancedSecurityOptions.builder()

    @Deprecated(message = "deprecated in CDK")
    override fun masterUserArn(masterUserArn: String) {
      cdkBuilder.masterUserArn(masterUserArn)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun masterUserName(masterUserName: String) {
      cdkBuilder.masterUserName(masterUserName)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun masterUserPassword(masterUserPassword: SecretValue) {
      cdkBuilder.masterUserPassword(masterUserPassword.let(SecretValue::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticsearch.AdvancedSecurityOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticsearch.AdvancedSecurityOptions,
  ) : CdkObject(cdkObject), AdvancedSecurityOptions {
    @Deprecated(message = "deprecated in CDK")
    override fun masterUserArn(): String? = unwrap(this).getMasterUserArn()

    @Deprecated(message = "deprecated in CDK")
    override fun masterUserName(): String? = unwrap(this).getMasterUserName()

    @Deprecated(message = "deprecated in CDK")
    override fun masterUserPassword(): SecretValue? =
        unwrap(this).getMasterUserPassword()?.let(SecretValue::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AdvancedSecurityOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.AdvancedSecurityOptions):
        AdvancedSecurityOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AdvancedSecurityOptions):
        software.amazon.awscdk.services.elasticsearch.AdvancedSecurityOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticsearch.AdvancedSecurityOptions
  }
}
