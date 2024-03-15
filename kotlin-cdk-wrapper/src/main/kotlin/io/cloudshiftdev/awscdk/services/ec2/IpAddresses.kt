@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public open class IpAddresses internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.IpAddresses,
) : CdkObject(cdkObject) {
  public companion object {
    public fun awsIpamAllocation(props: AwsIpamProps): IIpAddresses =
        software.amazon.awscdk.services.ec2.IpAddresses.awsIpamAllocation(props.let(AwsIpamProps::unwrap)).let(IIpAddresses::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27407714c0d9440af0c80765721b424fa3415f353924aba4901f276414c99cb4")
    public fun awsIpamAllocation(props: AwsIpamProps.Builder.() -> Unit): IIpAddresses =
        awsIpamAllocation(AwsIpamProps(props))

    public fun cidr(cidrBlock: String): IIpAddresses =
        software.amazon.awscdk.services.ec2.IpAddresses.cidr(cidrBlock).let(IIpAddresses::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IpAddresses): IpAddresses =
        IpAddresses(cdkObject)

    internal fun unwrap(wrapped: IpAddresses): software.amazon.awscdk.services.ec2.IpAddresses =
        wrapped.cdkObject
  }
}
