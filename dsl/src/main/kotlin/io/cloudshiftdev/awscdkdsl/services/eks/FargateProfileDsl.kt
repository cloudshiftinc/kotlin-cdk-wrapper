@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.eks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.ec2.SubnetSelectionDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.eks.Cluster
import software.amazon.awscdk.services.eks.FargateProfile
import software.amazon.awscdk.services.eks.Selector
import software.amazon.awscdk.services.iam.IRole
import software.constructs.Construct

/**
 * Fargate profiles allows an administrator to declare which pods run on Fargate.
 *
 * This declaration is done through the profile’s selectors. Each profile can have up to five
 * selectors that contain a namespace and optional labels. You must define a namespace for every
 * selector. The label field consists of multiple optional key-value pairs. Pods that match a
 * selector (by matching a namespace for the selector and all of the labels specified in the
 * selector) are scheduled on Fargate. If a namespace selector is defined without any labels, Amazon
 * EKS will attempt to schedule all pods that run in that namespace onto Fargate using the profile.
 * If a to-be-scheduled pod matches any of the selectors in the Fargate profile, then that pod is
 * scheduled on Fargate.
 *
 * If a pod matches multiple Fargate profiles, Amazon EKS picks one of the matches at random. In
 * this case, you can specify which profile a pod should use by adding the following Kubernetes
 * label to the pod specification: eks.amazonaws.com/fargate-profile: profile_name. However, the pod
 * must still match a selector in that profile in order to be scheduled onto Fargate.
 *
 * Example:
 * ```
 * Cluster cluster;
 * FargateProfile.Builder.create(this, "MyProfile")
 * .cluster(cluster)
 * .selectors(List.of(Selector.builder().namespace("default").build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class FargateProfileDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: FargateProfile.Builder = FargateProfile.Builder.create(scope, id)

    private val _selectors: MutableList<Selector> = mutableListOf()

    /**
     * The EKS cluster to apply the Fargate profile to.
     *
     * [disable-awslint:ref-via-interface]
     *
     * @param cluster The EKS cluster to apply the Fargate profile to.
     */
    public fun cluster(cluster: Cluster) {
        cdkBuilder.cluster(cluster)
    }

    /**
     * The name of the Fargate profile.
     *
     * Default: - generated
     *
     * @param fargateProfileName The name of the Fargate profile.
     */
    public fun fargateProfileName(fargateProfileName: String) {
        cdkBuilder.fargateProfileName(fargateProfileName)
    }

    /**
     * The pod execution role to use for pods that match the selectors in the Fargate profile.
     *
     * The pod execution role allows Fargate infrastructure to register with your cluster as a node,
     * and it provides read access to Amazon ECR image repositories.
     *
     * Default: - a role will be automatically created
     *
     * [Documentation](https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html)
     *
     * @param podExecutionRole The pod execution role to use for pods that match the selectors in
     *   the Fargate profile.
     */
    public fun podExecutionRole(podExecutionRole: IRole) {
        cdkBuilder.podExecutionRole(podExecutionRole)
    }

    /**
     * The selectors to match for pods to use this Fargate profile.
     *
     * Each selector must have an associated namespace. Optionally, you can also specify labels for
     * a namespace.
     *
     * At least one selector is required and you may specify up to five selectors.
     *
     * @param selectors The selectors to match for pods to use this Fargate profile.
     */
    public fun selectors(selectors: SelectorDsl.() -> Unit) {
        _selectors.add(SelectorDsl().apply(selectors).build())
    }

    /**
     * The selectors to match for pods to use this Fargate profile.
     *
     * Each selector must have an associated namespace. Optionally, you can also specify labels for
     * a namespace.
     *
     * At least one selector is required and you may specify up to five selectors.
     *
     * @param selectors The selectors to match for pods to use this Fargate profile.
     */
    public fun selectors(selectors: Collection<Selector>) {
        _selectors.addAll(selectors)
    }

    /**
     * Select which subnets to launch your pods into.
     *
     * At this time, pods running on Fargate are not assigned public IP addresses, so only private
     * subnets (with no direct route to an Internet Gateway) are allowed.
     *
     * You must specify the VPC to customize the subnet selection
     *
     * Default: - all private subnets of the VPC are selected.
     *
     * @param subnetSelection Select which subnets to launch your pods into.
     */
    public fun subnetSelection(subnetSelection: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(subnetSelection)
        cdkBuilder.subnetSelection(builder.build())
    }

    /**
     * Select which subnets to launch your pods into.
     *
     * At this time, pods running on Fargate are not assigned public IP addresses, so only private
     * subnets (with no direct route to an Internet Gateway) are allowed.
     *
     * You must specify the VPC to customize the subnet selection
     *
     * Default: - all private subnets of the VPC are selected.
     *
     * @param subnetSelection Select which subnets to launch your pods into.
     */
    public fun subnetSelection(subnetSelection: SubnetSelection) {
        cdkBuilder.subnetSelection(subnetSelection)
    }

    /**
     * The VPC from which to select subnets to launch your pods into.
     *
     * By default, all private subnets are selected. You can customize this using `subnetSelection`.
     *
     * Default: - all private subnets used by the EKS cluster
     *
     * @param vpc The VPC from which to select subnets to launch your pods into.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): FargateProfile {
        if (_selectors.isNotEmpty()) cdkBuilder.selectors(_selectors)
        return cdkBuilder.build()
    }
}
