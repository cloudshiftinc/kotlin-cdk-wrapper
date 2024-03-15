@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backupgateway

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnHypervisorProps {
  public fun host(): String? = unwrap(this).getHost()

  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  public fun logGroupArn(): String? = unwrap(this).getLogGroupArn()

  public fun name(): String? = unwrap(this).getName()

  public fun password(): String? = unwrap(this).getPassword()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun username(): String? = unwrap(this).getUsername()

  @CdkDslMarker
  public interface Builder {
    public fun host(host: String)

    public fun kmsKeyArn(kmsKeyArn: String)

    public fun logGroupArn(logGroupArn: String)

    public fun name(name: String)

    public fun password(password: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun username(username: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backupgateway.CfnHypervisorProps.Builder
        = software.amazon.awscdk.services.backupgateway.CfnHypervisorProps.builder()

    override fun host(host: String) {
      cdkBuilder.host(host)
    }

    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    override fun logGroupArn(logGroupArn: String) {
      cdkBuilder.logGroupArn(logGroupArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun password(password: String) {
      cdkBuilder.password(password)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.backupgateway.CfnHypervisorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.backupgateway.CfnHypervisorProps,
  ) : CdkObject(cdkObject), CfnHypervisorProps {
    override fun host(): String? = unwrap(this).getHost()

    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    override fun logGroupArn(): String? = unwrap(this).getLogGroupArn()

    override fun name(): String? = unwrap(this).getName()

    override fun password(): String? = unwrap(this).getPassword()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun username(): String? = unwrap(this).getUsername()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnHypervisorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backupgateway.CfnHypervisorProps):
        CfnHypervisorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnHypervisorProps):
        software.amazon.awscdk.services.backupgateway.CfnHypervisorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.backupgateway.CfnHypervisorProps
  }
}
