@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Specify the secret's version id or version stage.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.batch.*;
 * SecretVersionInfo secretVersionInfo = SecretVersionInfo.builder()
 * .versionId("versionId")
 * .versionStage("versionStage")
 * .build();
 * ```
 */
public interface SecretVersionInfo {
  /**
   * version id of the secret.
   *
   * Default: - use default version id
   */
  public fun versionId(): String? = unwrap(this).getVersionId()

  /**
   * version stage of the secret.
   *
   * Default: - use default version stage
   */
  public fun versionStage(): String? = unwrap(this).getVersionStage()

  /**
   * A builder for [SecretVersionInfo]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param versionId version id of the secret.
     */
    public fun versionId(versionId: String)

    /**
     * @param versionStage version stage of the secret.
     */
    public fun versionStage(versionStage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.SecretVersionInfo.Builder =
        software.amazon.awscdk.services.batch.SecretVersionInfo.builder()

    /**
     * @param versionId version id of the secret.
     */
    override fun versionId(versionId: String) {
      cdkBuilder.versionId(versionId)
    }

    /**
     * @param versionStage version stage of the secret.
     */
    override fun versionStage(versionStage: String) {
      cdkBuilder.versionStage(versionStage)
    }

    public fun build(): software.amazon.awscdk.services.batch.SecretVersionInfo = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.batch.SecretVersionInfo,
  ) : CdkObject(cdkObject),
      SecretVersionInfo {
    /**
     * version id of the secret.
     *
     * Default: - use default version id
     */
    override fun versionId(): String? = unwrap(this).getVersionId()

    /**
     * version stage of the secret.
     *
     * Default: - use default version stage
     */
    override fun versionStage(): String? = unwrap(this).getVersionStage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SecretVersionInfo {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.SecretVersionInfo):
        SecretVersionInfo = CdkObjectWrappers.wrap(cdkObject) as? SecretVersionInfo ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecretVersionInfo):
        software.amazon.awscdk.services.batch.SecretVersionInfo = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.batch.SecretVersionInfo
  }
}
