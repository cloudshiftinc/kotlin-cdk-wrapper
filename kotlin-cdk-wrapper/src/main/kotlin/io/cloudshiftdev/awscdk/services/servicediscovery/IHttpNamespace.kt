@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 *
 */
public interface IHttpNamespace : INamespace {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.IHttpNamespace):
        IHttpNamespace = CdkObjectWrappers.wrap(cdkObject) as IHttpNamespace

    internal fun unwrap(wrapped: IHttpNamespace):
        software.amazon.awscdk.services.servicediscovery.IHttpNamespace = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicediscovery.IHttpNamespace
  }
}
