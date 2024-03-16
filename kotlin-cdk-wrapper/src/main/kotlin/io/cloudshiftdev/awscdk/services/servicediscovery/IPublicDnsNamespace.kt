@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 *
 */
public interface IPublicDnsNamespace : INamespace {
  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.IPublicDnsNamespace):
        IPublicDnsNamespace = CdkObjectWrappers.wrap(cdkObject) as IPublicDnsNamespace

    internal fun unwrap(wrapped: IPublicDnsNamespace):
        software.amazon.awscdk.services.servicediscovery.IPublicDnsNamespace = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicediscovery.IPublicDnsNamespace
  }
}
