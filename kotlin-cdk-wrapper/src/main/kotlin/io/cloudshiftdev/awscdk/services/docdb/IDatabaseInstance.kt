@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IDatabaseInstance : IResource {
  public fun dbInstanceEndpointAddress(): String

  public fun dbInstanceEndpointPort(): String

  public fun instanceArn(): String

  public fun instanceEndpoint(): Endpoint

  public fun instanceIdentifier(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.docdb.IDatabaseInstance,
  ) : CdkObject(cdkObject), IDatabaseInstance {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun dbInstanceEndpointAddress(): String = unwrap(this).getDbInstanceEndpointAddress()

    override fun dbInstanceEndpointPort(): String = unwrap(this).getDbInstanceEndpointPort()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    override fun instanceEndpoint(): Endpoint =
        unwrap(this).getInstanceEndpoint().let(Endpoint::wrap)

    override fun instanceIdentifier(): String = unwrap(this).getInstanceIdentifier()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.IDatabaseInstance):
        IDatabaseInstance = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDatabaseInstance):
        software.amazon.awscdk.services.docdb.IDatabaseInstance = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.docdb.IDatabaseInstance
  }
}
