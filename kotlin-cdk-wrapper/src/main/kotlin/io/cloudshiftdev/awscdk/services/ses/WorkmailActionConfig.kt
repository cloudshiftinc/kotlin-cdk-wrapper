@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface WorkmailActionConfig {
  public fun organizationArn(): String

  public fun topicArn(): String? = unwrap(this).getTopicArn()

  @CdkDslMarker
  public interface Builder {
    public fun organizationArn(organizationArn: String)

    public fun topicArn(topicArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.WorkmailActionConfig.Builder =
        software.amazon.awscdk.services.ses.WorkmailActionConfig.builder()

    override fun organizationArn(organizationArn: String) {
      cdkBuilder.organizationArn(organizationArn)
    }

    override fun topicArn(topicArn: String) {
      cdkBuilder.topicArn(topicArn)
    }

    public fun build(): software.amazon.awscdk.services.ses.WorkmailActionConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.WorkmailActionConfig,
  ) : CdkObject(cdkObject), WorkmailActionConfig {
    override fun organizationArn(): String = unwrap(this).getOrganizationArn()

    override fun topicArn(): String? = unwrap(this).getTopicArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WorkmailActionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.WorkmailActionConfig):
        WorkmailActionConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WorkmailActionConfig):
        software.amazon.awscdk.services.ses.WorkmailActionConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ses.WorkmailActionConfig
  }
}
