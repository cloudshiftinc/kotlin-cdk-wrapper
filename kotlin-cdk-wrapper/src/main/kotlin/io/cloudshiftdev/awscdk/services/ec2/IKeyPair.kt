@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * An EC2 Key Pair.
 */
public interface IKeyPair : IResource {
  /**
   * The name of the key pair.
   */
  public fun keyPairName(): String

  /**
   * The type of the key pair.
   */
  public fun type(): KeyPairType? = unwrap(this).getType()?.let(KeyPairType::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IKeyPair): IKeyPair =
        CdkObjectWrappers.wrap(cdkObject) as IKeyPair

    internal fun unwrap(wrapped: IKeyPair): software.amazon.awscdk.services.ec2.IKeyPair = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IKeyPair
  }
}
