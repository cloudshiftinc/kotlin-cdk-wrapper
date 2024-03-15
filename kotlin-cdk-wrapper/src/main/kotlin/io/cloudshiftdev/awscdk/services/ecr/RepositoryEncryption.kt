@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class RepositoryEncryption internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecr.RepositoryEncryption,
) : CdkObject(cdkObject) {
  public open fun `value`(): String = unwrap(this).getValue()

  public companion object {
    public val AES_256: RepositoryEncryption =
        RepositoryEncryption.wrap(software.amazon.awscdk.services.ecr.RepositoryEncryption.AES_256)

    public val KMS: RepositoryEncryption =
        RepositoryEncryption.wrap(software.amazon.awscdk.services.ecr.RepositoryEncryption.KMS)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.RepositoryEncryption):
        RepositoryEncryption = RepositoryEncryption(cdkObject)

    internal fun unwrap(wrapped: RepositoryEncryption):
        software.amazon.awscdk.services.ecr.RepositoryEncryption = wrapped.cdkObject
  }
}
