@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a new Step Functions Activity.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * import io.cloudshiftdev.awscdk.*;
 * Key kmsKey = new Key(this, "Key");
 * Activity activity = Activity.Builder.create(this, "ActivityWithCMKEncryptionConfiguration")
 * .activityName("ActivityWithCMKEncryptionConfiguration")
 * .encryptionConfiguration(new CustomerManagedEncryptionConfiguration(kmsKey,
 * Duration.seconds(75)))
 * .build();
 * ```
 */
public interface ActivityProps {
  /**
   * The name for this activity.
   *
   * Default: - If not supplied, a name is generated
   */
  public fun activityName(): String? = unwrap(this).getActivityName()

  /**
   * The encryptionConfiguration object used for server-side encryption of the activity inputs.
   *
   * Default: - data is transparently encrypted using an AWS owned key
   */
  public fun encryptionConfiguration(): EncryptionConfiguration? =
      unwrap(this).getEncryptionConfiguration()?.let(EncryptionConfiguration::wrap)

  /**
   * A builder for [ActivityProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param activityName The name for this activity.
     */
    public fun activityName(activityName: String)

    /**
     * @param encryptionConfiguration The encryptionConfiguration object used for server-side
     * encryption of the activity inputs.
     */
    public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfiguration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.ActivityProps.Builder =
        software.amazon.awscdk.services.stepfunctions.ActivityProps.builder()

    /**
     * @param activityName The name for this activity.
     */
    override fun activityName(activityName: String) {
      cdkBuilder.activityName(activityName)
    }

    /**
     * @param encryptionConfiguration The encryptionConfiguration object used for server-side
     * encryption of the activity inputs.
     */
    override fun encryptionConfiguration(encryptionConfiguration: EncryptionConfiguration) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfiguration.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.ActivityProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.ActivityProps,
  ) : CdkObject(cdkObject),
      ActivityProps {
    /**
     * The name for this activity.
     *
     * Default: - If not supplied, a name is generated
     */
    override fun activityName(): String? = unwrap(this).getActivityName()

    /**
     * The encryptionConfiguration object used for server-side encryption of the activity inputs.
     *
     * Default: - data is transparently encrypted using an AWS owned key
     */
    override fun encryptionConfiguration(): EncryptionConfiguration? =
        unwrap(this).getEncryptionConfiguration()?.let(EncryptionConfiguration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ActivityProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ActivityProps):
        ActivityProps = CdkObjectWrappers.wrap(cdkObject) as? ActivityProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ActivityProps):
        software.amazon.awscdk.services.stepfunctions.ActivityProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.ActivityProps
  }
}
