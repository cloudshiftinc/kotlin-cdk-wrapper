@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codestarnotifications

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Information about the Codebuild or CodePipeline associated with a notification source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codestarnotifications.*;
 * NotificationRuleSourceConfig notificationRuleSourceConfig =
 * NotificationRuleSourceConfig.builder()
 * .sourceArn("sourceArn")
 * .build();
 * ```
 */
public interface NotificationRuleSourceConfig {
  /**
   * The Amazon Resource Name (ARN) of the notification source.
   */
  public fun sourceArn(): String

  /**
   * A builder for [NotificationRuleSourceConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param sourceArn The Amazon Resource Name (ARN) of the notification source. 
     */
    public fun sourceArn(sourceArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig.Builder =
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig.builder()

    /**
     * @param sourceArn The Amazon Resource Name (ARN) of the notification source. 
     */
    override fun sourceArn(sourceArn: String) {
      cdkBuilder.sourceArn(sourceArn)
    }

    public fun build():
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig,
  ) : CdkObject(cdkObject), NotificationRuleSourceConfig {
    /**
     * The Amazon Resource Name (ARN) of the notification source.
     */
    override fun sourceArn(): String = unwrap(this).getSourceArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NotificationRuleSourceConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig):
        NotificationRuleSourceConfig = CdkObjectWrappers.wrap(cdkObject) as?
        NotificationRuleSourceConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: NotificationRuleSourceConfig):
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig
  }
}
