@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable

/**
 * An interface for defining a source that can be used in an Amazon Data Firehose delivery stream.
 */
public interface ISource {
  /**
   * Grant read permissions for this source resource and its contents to an IAM principal (the
   * delivery stream).
   *
   * If an encryption key is used, permission to use the key to decrypt the
   * contents of the stream will also be granted.
   *
   * @param grantee 
   */
  public fun grantRead(grantee: IGrantable): Grant

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesisfirehose.ISource,
  ) : CdkObject(cdkObject),
      ISource {
    /**
     * Grant read permissions for this source resource and its contents to an IAM principal (the
     * delivery stream).
     *
     * If an encryption key is used, permission to use the key to decrypt the
     * contents of the stream will also be granted.
     *
     * @param grantee 
     */
    override fun grantRead(grantee: IGrantable): Grant =
        unwrap(this).grantRead(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.ISource): ISource =
        CdkObjectWrappers.wrap(cdkObject) as? ISource ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISource): software.amazon.awscdk.services.kinesisfirehose.ISource =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.kinesisfirehose.ISource
  }
}
