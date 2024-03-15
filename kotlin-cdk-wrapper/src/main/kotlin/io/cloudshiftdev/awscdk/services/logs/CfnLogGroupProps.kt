@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnLogGroupProps {
  public fun dataProtectionPolicy(): Any? = unwrap(this).getDataProtectionPolicy()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun logGroupClass(): String? = unwrap(this).getLogGroupClass()

  public fun logGroupName(): String? = unwrap(this).getLogGroupName()

  public fun retentionInDays(): Number? = unwrap(this).getRetentionInDays()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun dataProtectionPolicy(dataProtectionPolicy: Any)

    public fun kmsKeyId(kmsKeyId: String)

    public fun logGroupClass(logGroupClass: String)

    public fun logGroupName(logGroupName: String)

    public fun retentionInDays(retentionInDays: Number)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnLogGroupProps.Builder =
        software.amazon.awscdk.services.logs.CfnLogGroupProps.builder()

    override fun dataProtectionPolicy(dataProtectionPolicy: Any) {
      cdkBuilder.dataProtectionPolicy(dataProtectionPolicy)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun logGroupClass(logGroupClass: String) {
      cdkBuilder.logGroupClass(logGroupClass)
    }

    override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    override fun retentionInDays(retentionInDays: Number) {
      cdkBuilder.retentionInDays(retentionInDays)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.logs.CfnLogGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.CfnLogGroupProps,
  ) : CdkObject(cdkObject), CfnLogGroupProps {
    override fun dataProtectionPolicy(): Any? = unwrap(this).getDataProtectionPolicy()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun logGroupClass(): String? = unwrap(this).getLogGroupClass()

    override fun logGroupName(): String? = unwrap(this).getLogGroupName()

    override fun retentionInDays(): Number? = unwrap(this).getRetentionInDays()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLogGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnLogGroupProps):
        CfnLogGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLogGroupProps):
        software.amazon.awscdk.services.logs.CfnLogGroupProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.CfnLogGroupProps
  }
}
